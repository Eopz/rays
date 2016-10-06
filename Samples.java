//This is a sample output
public class Samples{

	//Relative position tells from what point is it r and theta from
	double r;
	double theta;
	position relativePosition;
	
	public Samples(double r, double theta, position p){
		this.r = r;
		this.theta = theta;
		relativePosition = p; 
	}
	
	//returns the absolute position of this sample
	public position absolutePosition(){
		return new position(0,0);
	}
	
	//toString function
	public String toString(){
		return "This is the r: " + r + "\nThis is the theta: " + theta + "\nThis is what it's relative to" + relativePosition.toString();
	}
}