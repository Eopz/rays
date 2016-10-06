import java.lang.*;

public class device{
	//enum to define quadrants
	public enum QUADRANT{
		FIRST,
		SECOND,
		THIRD,
		FOURTH
	}
	position objPosition;
	double offsetAngle; //Not sure why this is there right now, might end up deleting in later iteration
	int samplingFrequency;
	double facingAngle;
	
	//initialize a device that takes a signal
	public device(position p, double o, int s, double f){
		
		objPosition = p;
		offsetAngle = o;
		samplingFrequency = s;
		facingAngle = f;
	}
	
	//The direction of the signal relative to 0 degrees
	public double angleFromOrigin(){
		return facingAngle + offsetAngle;
	}
	
	/*
		All the change functions are there to let people set variables
		Can change any of the values of device
	*/
	public void changeOffsetAngle(double o){
		offsetAngle = o;
	}
	
	public void changeFacingAngle(double f){
		facingAngle = f;
	}
	
	public void changePosition(double x, double y){
		objPosition.x = x;
		objPosition.y = y;
	}
	
	public void changeSamplingFrequency(int s){
		samplingFrequency = s;
	}
	
	/*
		Takes a sample
	*/
	public Samples takeSample(position p){
		double x = p.x - objPosition.x;
		double y = p.y - objPosition.y;
		
		double r = Math.hypot(x,y);
		double theta = angleFinder(p);
		
		return new Samples(r, theta, objPosition);
		
	}
	
	//finds which relative quandrant the signal crosses or random point is compared to device
	protected QUADRANT relativeFinder(position p){
		
		if(p.x > objPosition.x && p.y >= objPosition.y){
			return QUADRANT.FIRST;
		}
		else if(p.x >= objPosition.x && p.y < objPosition.y){
			return QUADRANT.FOURTH;
		}
		else if(p.x <= objPosition.x && p.y > objPosition.y){
			return QUADRANT.SECOND;
		}
		else{ //if(p.x < objPosition.x && p.y <= objPosition.y){
			return QUADRANT.THIRD;
		}
		
	}
	
	/*
		Finds the angle in radian values
		Returns value in Radian
		For relative to the device itself
	*/
	protected double angleFinder(position p){
		double x_diff = p.x - objPosition.x;
		double y_diff = p.y - objPosition.y;
		double inverseTan = (double) y_diff/x_diff;
		double theta = Math.atan(inverseTan);
		switch(relativeFinder(p)){
			case FIRST:
				break;
			case SECOND:
				theta = theta + Math.PI;
				break;
			case THIRD:
				theta = theta + Math.PI;
				break;
			case FOURTH:
				theta = theta + Math.PI * 2;
				break;
			
		}
		return theta;
	}
	
}