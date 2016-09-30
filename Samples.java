package rays;
//This is a sample output
public class Samples{

	//Relative position tells from what point is it r and theta from
	int r;
	int theta;
	position relativePosition;
	
	public Samples(int r, int theta, position p){
		r.this = r;
		theta.this = theta;
		relativePosition = p; 
	}
	
	//returns the absolute position of this sample
	public position absolutePosition(){
	}
	
	//toString function
	public String toString(){
		return "This is the r: " + r + "\nThis is the theta: " + theta + "\This is what it's relative to" + relativePosition.toString();
	}
}