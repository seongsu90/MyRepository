package ch11.exam03;

import java.util.Calendar;

import ch06.exam08.Calculator;

public class Date {
		@Override
		public String toString() {
			Calendar now = Calendar.getInstance(); //이게 뭘까? ,싱글톤?
			int year = now.get(Calendar.YEAR); //YEAR가 대문자가라서 Calender.YEAR 은 상수다.
			
			int month = now.get(Calendar.MONTH)+1;
			
			int day = now.get(Calendar.DAY_OF_MONTH);
			return year + "-" + month + "-" + day;
		}
}
