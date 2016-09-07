package ch12.exam06;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {sumThread.join();} catch (InterruptedException e) {}
		System.out.println("1~100 합: "+ sumThread.getSum()); //값이 여러개 나오는 경우는 아직 sum 계산이 안끝난 경우도 있기 떄문

	}

}
