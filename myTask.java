import java.util.*;
import java.lang.*;

/*
	A function that uses threads in order to take Samples
	Implements the runnable interface
	Inside each thread there is a device, list of samples, numbers of samples you want it to take
	Sleeps the thread in order to simulate how many times it samples "sampling frequency"
*/
public class myTask implements Runnable{
	
	//All the information stored in each task object
	device d;
	ArrayList<Samples> dSamples;
	position randomObj;
	int numSamples;
	
	//Initialize the device that is taking samples
	//Initialize the number of samples taken
	public myTask(device d, int numSamples){
		this.d = d;
		dSamples = new ArrayList<Samples>();
		this.numSamples = numSamples;
	}
	
	//The thread runs
	public void run(){
		for(int i = 0; i < numSamples; i++){
			//Making the random object which you taking a sample to
			double t1 = Math.random() * 20;
			double t2 = Math.random() * 20;
			randomObj = new position(t1,t2);
			dSamples.add(d.takeSample(randomObj));
			try{
				System.out.println("Sample Number " + i + " has been added.");
				Thread.sleep(1000/d.samplingFrequency);
			} catch(InterruptedException e){
			}
		}
		//Print out all the samples taken
		for(int i = 0; i < dSamples.size(); i++)
			System.out.println(dSamples.get(i).toString());
	}
	
	
}