package ch09.exam13;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		int value =10;
		
		btnOk.setOnClickListener(new Button.OnClickListener() { //익명객체의 생성자이다.

			@Override
			public void onClick() {
				//value =5; final 타입이라 안된다.
				System.out.println("음악을"+value+"번 재생합니다.");
			}
			
		});
		
		btnOk.click();
	}

}

