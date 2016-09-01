package ch09.exam09;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		btnOk.setOnClickListener(new OkListener());
		
		Button btnCancel = new Button();
		btnCancel.setOnClickListener(new CancelListener());
		
		btnOk.click();
		btnCancel.click();
	}
	

}

class OkListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("OK버튼을 클릭했습니다.");
		
	}
	
}
	class CancelListener implements Button.OnClickListener {
		@Override
		public void onClick() {
		System.out.println("취소했습니다.");
			
		}
}