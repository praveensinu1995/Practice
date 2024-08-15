package InterviweQuestion;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiThread {

	private static volatile int count;
	public static void main(String[] args){
		
//		atomicIntegerCount();
		increasCount();
		
	}

	private static void increasCount() {			
		Runnable runnable=()->{
			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				incrementCount();
			}
		};
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		t1.start();
		t2.start();
		try {
		t1.join();
		t2.join();
		}catch(InterruptedException e) {
			e.getMessage();
		}
		System.out.println(count);
	}
	static synchronized void incrementCount() {
		count++;
	}

	private static void atomicIntegerCount() {
		// TODO Auto-generated method stub
		AtomicInteger count=new AtomicInteger();
		Runnable runnable=()->{
			for (int i = 0; i < 10; i++) {
				count.incrementAndGet();
			}
		};
		
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
	}
}
