import java.lang.*;
/*
	Class made for object purposes
	Position objects contiains both x and y
*/
public class position{
	double x;
	double y;

	
	public position(double x, double y){
		this.x = x;
		this.y = y;
	}

	public PolarPosition convertToPolarPosition(){
		double r = Math.hypot(x,y);
		device temp = new device(new position(0,0), 0, 0, 0);
		double theta = temp.angleFinder(this);
		
		return new PolarPosition(r, theta);
	}

	public String toString(){
		return "The X-coordinate is: " + x + "\nThe Y-coordinate is: " + y;
	}
}