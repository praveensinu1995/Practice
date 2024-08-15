package Code;

public class UpdateValueWithSynchronizedAndVoliatial implements Runnable {

	private  volatile int a;
	@Override
	public synchronized void  run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a++;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		UpdateValueWithSynchronizedAndVoliatial andVoliatial=new UpdateValueWithSynchronizedAndVoliatial();
		Thread t1=new Thread(andVoliatial);
		Thread t2=new Thread(andVoliatial);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(andVoliatial.a);
	}

}
