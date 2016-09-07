package ch12.exam08;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox databox)
	{
		this.dataBox = databox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3;i++)
		{
			String data ="Data-"+i;
			dataBox.setData(data);
		}
	
	}
}
