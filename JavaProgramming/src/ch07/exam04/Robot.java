package ch07.exam04;

	public class Robot extends Machine {
		@Override // 어노테이션을 통해 재정의가 정상적인지 확인할수 있다.
		public void work() {
			
			System.out.println("Robot-worl() 실행");
			super.work();
		}
		
}
