package InterviweQuestion;

import java.util.Iterator;

public class Myrunable implements Runnable {

	private final Object lock;
	public volatile int count;
	Myrunable(Object lock){
		this.lock=lock;
	}
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public void run() {
		synchronized (lock) {
			for (int i = 0; i < 100; i++) {
				count++;
			}
		}
		
	}
	
	
}
