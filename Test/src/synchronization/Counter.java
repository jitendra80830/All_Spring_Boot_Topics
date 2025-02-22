package synchronization;

public class Counter {

	private int count = 0;

	public synchronized void inc(int t) {
		System.out.println("Increament for thread: "+t);
		count++;
	}

	public synchronized int get() {
		return count;
	}

}
