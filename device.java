package rays;
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
	int offsetAngle;
	int samplingFrequency;
	int facingAngle;
	
	//initialize a device that takes a signal
	public device(int p, int o, int s, int f){
		
		position = p;
		offsetAngle = o;
		samplingFrequnecy = s;
		facingAngle = f;
	}
	
	//The direction of the signal relative to 0 degrees
	public int angleFromOrigin(){
		return facingAngle + offSetAngle;
	}
	
	/*
		All the change functions are there to let people set variables
		Can change any of the values of device
	*/
	public void changeOffsetAngle(int o){
		offsetAngle = o;
	}
	
	public void changeFacingAngle(int f){
		facingAngle = f;
	}
	
	public void changePosition(int x, int y){
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
		int x = p.x + objPosition.x;
		int y = p.y + objPosition.y;
		
		int r = Math.hypot(x,y);
		int theta = angleFinder(p);
		
		return new Samples(r, theta, objPosition);
		
	}
	
	//finds which relative quandrant the signal crosses or random point is compared to device
	protected QUADRANT relativeFinder(position p){
		
		if(p.x > objPosition.x && p.y >= objPosition.y){
			return FIRST;
		}
		else if(p.x >= objPosition.x && p.y < objPosition.y){
			return FOURTH;
		}
		else if(p.x <= objPosition.x && p.y > objPosition.y){
			return SECOND;
		}
		else if(p.x < objPosition.x && p.y <= objPosition.y){
			return THIRD;
		}
	}
	
	/*
		Finds the angle in radian values
		Returns value in Radian
		For relative to the device itself
	*/
	protected int angleFinder(position p){
		int x_diff = p.x - objPosition.x;
		int y_diff = p.y - objPosition.y;
		double inverseTan = (double) y/x;
		int theta = Math.atan((double)y/x));
		switch(relativeFinder(p)){
			case FIRST:
				break;
			case SECOND:
				theta + Math.PI;
				break;
			case THIRD:
				theta + Math.PI;
				break;
			case FOURTH:
				theta + Math.PI * 2;
				break;
			
		}
		return theta;
	}
	
}