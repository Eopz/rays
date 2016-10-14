import java.lang.*;
/*
	Position Defined in Polar Position
	Uses R and theta
*/
public class PolarPosition{
	
	double r;
	double theta;
	
	//Initiazlie PolarPosition
	public PolarPosition(double r, double theta){
		this.r = r;
		this.theta = theta;
	}
	
	//Convert to normal position
	public position convertToPosition(){
		double x = r * Math.cos(theta);
		double y = r * Math.sin(theta);
		return new position(x, y);
	}
	
	//ToString so you can output the values of the PolarPosition
	public String toString(){
		return "The r is: " + r + "\nThe theta is: " + theta;
	}
	
}