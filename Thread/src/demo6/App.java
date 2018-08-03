package demo6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable{
	private int id;
	public Processor(int id){
		this.id=id;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" starting: "+id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" completed: "+id);
		
	}
	
}
public class App {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		
		for(int i=0; i<5; i++){
			executor.submit(new Processor(i));
		}
		System.out.println("All task submitted");
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All task completed");
		

	}

}
