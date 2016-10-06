import java.util.*;
public class Intersections{
	public static void main(String[] args){
		Timer timer = new Timer();
		device d1 = new device(new position(3, 3), 0, 10, 0);
		device d2 = new device(new position(3, 0), 0, 10, 0);
		position randomObj = new position (15,12);
		System.out.println("Hello");
		ArrayList<Samples> d1Samples = new ArrayList<Samples>();
		ArrayList<Samples> d2Samples = new ArrayList<Samples>();
		d1Samples.add(d1.takeSample(randomObj));
		System.out.println("Hi");
		
		for(int i = 0; i < d1Samples.size(); i++)
			System.out.println(d1Samples.get(i).toString());
		/*Timer t1 = new Timer();
		
		t1.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run(){
				d1Samples.add(d1.takeSample(randomObj));
			}
		}
		,d1.samplingFrequency * 1000, 50000);
		
		Timer t2 = new Timer();
		
		t2.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run(){
				d2Samples.add(d2.takeSample(randomObj));
			}
		},d2.samplingFrequency * 1000, 50000);
		
		for(int i = 0; i < d1Samples.size(); i++)
			System.out.println(d1Samples.get(1).toString());
		
		for(int i = 0; i < d2Samples.size(); i++)
			System.out.println(d2Samples.get(i).toString());*/
	}
}