package java1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService ex=Executors.newFixedThreadPool(10);
		ex.execute(new A1());
		ex.execute(new A1());
		ex.execute(new A1());
		ex.shutdown();

	}

}

class A1 implements Runnable{
	
	void task() {
		for(int i=0;i<50;i++) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
			
	}

	@Override
	public void run() {
		task();
		
	}
	
}