package ch12.exam07;

import java.util.Calendar;

public class EnumExample {

	public static void main(String[] args) {
		Week week ;
		
		//int week;
		
		Calendar now = Calendar.getInstance();
		
		switch(now.get(Calendar.DAY_OF_WEEK))
		{
		case 1: week= Week.SUNDAY; break;
		case 2: week=Week.MONDAY; break;
		case 3: week=Week.TUESDAY; break;
		case 4:week=Week.WEDNESDAY; break;
		case 5: week=Week.THURSDAY; break;
		case 6: week=Week.FRIDAY; break;
		default : week=Week.SATURDAY;
		/*case 1: week=1; break;
		case 2: week=2; break;
		case 3: week=3; break;
		case 4: week=4; break;
		case 5: week=5; break;
		case 6: week=6; break;
		default : week=7;*/
		}
		System.out.println(week);
		
		/*if(week ==Week.FRIDAY)
		{
			
		}*/
	}

}
