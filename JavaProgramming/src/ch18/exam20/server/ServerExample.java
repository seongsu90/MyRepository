package ch18.exam20.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample { //exam20 에서는 스레드 처리
	
	private static ServerSocket serverSocket;
	private static boolean stop;
	
	public static void main(String[] args) 
	{
		System.out.println("서버 시작");
		
		try {
			//서버의 어떤 IP라도 접근할 수있도록 한것
			serverSocket = new ServerSocket(5001);
						
			
			Thread thread = new Thread(){ //익명객체
				@Override
				public void run() {
					waitAndAccept();
				}
			};
			thread.start();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.print("명령어 입력: ");
		String command = scanner.nextLine();
		if(command.equals("stop"))
		{
			stop =true; //작업 스레드 중지 (클라이언트의 연결 수락을 중지)
			try{
				serverSocket.close(); //서버자체를 종료
				}catch (IOException e) {}
			System.out.println("서버 종료. 이용해주셔서 감사합니다.");
			System.exit(0);   // 서버 Process 종료
			}else{
				System.out.println("명령어가 잘못되었습니다. 다시 입력해 주세요");
			}
		}
		
	}
	
	private static void waitAndAccept()
	{ 
		try{
			while(!stop){
				//클라이언트의 연결을 수락하고 통신용 Socket을 생성
				Socket socket =serverSocket.accept();
				
				//클라이언트에서 보낸 데이터를 받기
				InputStream is = socket.getInputStream();
				byte[] receiveValues = new byte[1024];
				int byteNum = is.read(receiveValues);
				String data = new String(receiveValues,0,byteNum,"UTF-8");
				
				//다시 클라이언트로 에코 보내기
				OutputStream os = socket.getOutputStream();
				byte[] sendValues = data.getBytes("UTF-8");
				os.write(sendValues);
				os.flush();
				
				//클라이언트의 연결을 끊음
				socket.close(); //클라이언트와 연결을 종료
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}

