import java.util.*;
import java.lang.*;

public class myTask implements Runnable{

	device d;
	ArrayList<Samples> dSamples;
	position randomObj;
	int numSamples;
	public myTask(device d, int numSamples){
		this.d = d;
		dSamples = new ArrayList<Samples>();
		this.numSamples = numSamples;
	}
	
	
	public void run(){
		for(int i = 0; i < numSamples; i++){
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
		for(int i = 0; i < dSamples.size(); i++)
			System.out.println(dSamples.get(i).toString());
	}
	
	public ArrayList<Samples> getSamples(){
		return dSamples;
	}
	
	
}