package InterviweQuestion;

public class MutithreadingRunable {

	public static void main(String[] args) throws InterruptedException {
		MutithreadingRunable mutithreadingRunable = new MutithreadingRunable();
		Myrunable myrunable = new Myrunable(new Object());
		Thread t1 = new Thread(myrunable);
		Thread t2 = new Thread(myrunable);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(myrunable.getCount());

	}
}
