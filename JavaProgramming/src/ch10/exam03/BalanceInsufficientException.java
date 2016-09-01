package ch10.exam03;

public class BalanceInsufficientException extends RuntimeException{ //Exception의 경우 컴파일 예외처리 이므로 try-catch 문이 있어야 된다.
	public BalanceInsufficientException(){}
	public BalanceInsufficientException(String message)
	{
		super(message);
	}
}
