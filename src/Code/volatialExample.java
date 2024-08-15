package Code;

public class volatialExample {

	private static volatile int a;
	private static final Object lock = new Object();

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock) {
					a++;
					System.out.println(a);
				}
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock) {
					a++;
					System.out.println("Thread 2");
				}
			}
		});
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("value =" + a);
	}
}
