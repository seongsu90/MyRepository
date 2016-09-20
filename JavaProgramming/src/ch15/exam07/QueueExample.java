package ch15.exam07;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<>();
		
		queue.offer(new Message("sendMail","홍길동"));
		queue.offer(new Message("sendSMS","감자바"));
		queue.offer(new Message("sendKaKaotalk","홍두께"));

		
		while(!queue.isEmpty())
		{
			Message message = queue.poll();
			switch(message.command)
			{
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to+"님에게 SMS을 보냅니다.");
				break;
			case "sendKaKaotalk":
				System.out.println(message.to+"님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}

}
