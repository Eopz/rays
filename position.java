package rays;
import java.lang.*;
/*
	Class made for object purposes
	Position objects contiains both x and y
*/
public class position{
	int x;
	int y;

	
	public position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public PolarPosition convertToPolarPosition(){
		int r = Math.hypot(x,y);
	}
	
	public String toString(){
		return "The X-coordinate is: " + x + "\nThe Y-coordinate is: " + y;
	}
}