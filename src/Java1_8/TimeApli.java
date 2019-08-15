package Java1_8;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeApli {
	public static void main(String[] args) {
	//	LocalDate d=LocalDate.of(1995,Month.FEBRUARY,29);
		LocalTime d=LocalTime.now();
		System.out.println(d);
		LocalDateTime d1=LocalDateTime.now();
		System.out.println(d1);
				
	}

}
