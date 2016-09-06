package ch10.test;

public class NotExistIDException extends Exception{
	public NotExistIDException(){}
	
	public NotExistIDException(String message){
		
		super(message);
		}
}
