package ch12.exam08;

public class WaitNotifyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBox databox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(databox);
		ConsumerThread consumerThread = new ConsumerThread(databox);
		
		producerThread.start();
		consumerThread.start();
	}

}
