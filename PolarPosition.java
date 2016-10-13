import java.lang.*;
public class PolarPosition{
	
	double r;
	double theta;
	
	public PolarPosition(double r, double theta){
		this.r = r;
		this.theta = theta;
	}
	
	public position convertToPosition(){
		double x = r * Math.cos(theta);
		double y = r * Math.sin(theta);
		return new position(x, y);
	}
	
	public String toString(){
		return "The r is: " + r + "\nThe theta is: " + theta;
	}
	
}