package ch12.exam08;

public class ConsumerThread extends Thread{
	private DataBox dataBox;
	
	public ConsumerThread(DataBox databox)
	{
		this.dataBox = databox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3;i++)
		{
			String data = dataBox.getData();
		}
	
	}
}
