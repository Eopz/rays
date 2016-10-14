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
	}
}