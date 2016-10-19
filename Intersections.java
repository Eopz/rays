import java.util.*;
public class Intersections{
	public static void main(String[] args){
		//Makes the Device
		device d1 = new device(new position(3, 3), 0, 10, 0);
		
		//Makes the thread that will run the tests
		myTask thread = new myTask(d1, 10);
		Thread t1 = new Thread(thread, "device 1");
		
		//Run
		t1.start();
		
		//Testing Conversion Functionality
		position testpos = new position(-5, 10);
		System.out.println(testpos.convertToPolarPosition().toString());
		PolarPosition testPP = new PolarPosition(5, 3.14);
		System.out.println(testPP.convertToPosition().toString());
	}
}