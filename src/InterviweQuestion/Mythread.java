package InterviweQuestion;


public class Mythread {

	private static volatile int count;
	
	public static void main(String[] args) {
		Object lock=new Object();
		Runnable runnable=()->{
			 synchronized (lock) {
			for (int i = 0; i < 100; i++) {
				count++;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}
		};
		
		Thread thread1=new Thread(runnable);
		Thread thread2=new Thread(runnable);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(count);
		
	}
}
