package workoutPkg;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerProb {

	class Producer implements Runnable {
		private BlockingQueue blkQueue;
		
		Producer(BlockingQueue bQueue) {
			this.blkQueue = bQueue;
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				String eObj = "Event" + i;
				try {
					System.out.println("Adding to queue " + eObj);
					blkQueue.put(eObj);
				} catch (InterruptedException e) {
					System.out.println("Producer interrupted " + e.getMessage());
				}
			}
		}
	}
	
	class Consumer implements Runnable {
		private BlockingQueue blockingQ;
		
		Consumer(BlockingQueue bQueue) {
			this.blockingQ = bQueue;
		}
		
		@Override
		public void run() {	
			try {
				while(true) {
					String eObj = (String) blockingQ.take();
					System.out.println(eObj);
				}
			} catch (InterruptedException e) {
				System.out.println("Consumer thread interrupted " + e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		BlockingQueue bQueue = new LinkedBlockingQueue<String>();
		ProducerConsumerProb pcObj = new ProducerConsumerProb();
		
		Thread pThread =  new Thread(pcObj.new Producer(bQueue));
		Thread cThread = new Thread(pcObj.new Consumer(bQueue));
		
		pThread.start();
		cThread.start();
	}
}