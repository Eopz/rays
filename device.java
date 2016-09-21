package rays;
import java.lang.*;

public class device{
	
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
	
	public Samples takeSample(position p){
		int x = p.x + objPosition.x;
		int y = p.y + objPosition.y;
		
		int r = Math.hypot(x,y);
		
		
	}
	
	protected int relativeFinder(position p){
		
		if(p.x > objPosition.x && p.y >= objPosition.y){
		}
		else if(p.x >= objPosition.x && p.y < objPosition.y){
		}
		else if(p.x <= objPosition.x && p.y > objPosition.y){
		}
		else if(p.x < objPosition.x && p.y <= objPosition.y){
		
		}
	}
	
}