package ch09.exam12;

import java.rmi.Remote;
import java.rmi.RemoteException;

public class AnonymousTest {
	//field
	private RemoteControl rc = new RemoteControl(){};
	
	//constructor
	public AnonymousTest()
	{
		RemoteControl rc = new RemoteControl(){};
	}
	
	//Method
	public void method1(RemoteControl rc)
	{
		
	}
	
	public void method2()
	{
		method1(new RemoteControl(){});
	}
}
