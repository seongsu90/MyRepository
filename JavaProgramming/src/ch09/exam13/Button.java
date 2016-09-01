package ch09.exam13;

public class Button {
	
	public static interface OnClickListener //중첩인터페이스 선언
	{
		void onClick();
	}
	
	private OnClickListener onClickListener; // 인스턴스 필드다 // 타입은 인터페이스
	
	
	public void setOnClickListener(OnClickListener onClickListener) { //필드의 값 설정하는 setter가 있다.
		this.onClickListener = onClickListener;
	}


	public void click()
	{
		if(onClickListener != null){
		onClickListener.onClick();
		}
	}
}
