package workoutPkg;

public class EvenOddProb implements Runnable {
	private static int initCounter = 0;
	private static final int endCounter = 100;
	
	public synchronized void run() {
		while (initCounter < endCounter ) {
			try {
				if (initCounter%2 == 0 ) {
					System.out.println("Even counter " + Thread.currentThread().getName() + " " + initCounter );
				} else {
					System.out.println("Odd Counter " + Thread.currentThread().getName() + "  " + initCounter);
				}
				initCounter++;
				notify();
				wait();
			} catch (InterruptedException e) {
				// 	TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

	public static void main(String[] args) {

		EvenOddProb evOddThread = new EvenOddProb();
		Thread evenThread = new Thread(evOddThread, "EvenThread");
		Thread oddThread = new Thread(evOddThread, " OddThread");
		
		evenThread.start();
		oddThread.start();
		try {
			evenThread.join();
			oddThread.join();
		} catch(InterruptedException e ) {
			System.out.println(e.getMessage());
		}
	}

}