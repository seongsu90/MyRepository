package ch11.exam08;

public class Car {
	private String model;
	private String owner;
	
	public Car() {}
	public Car(String model)	{}
	
	//클래스 안에 있는 멤버들을 조사하는것을 리플렉션이라고 한다.
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
