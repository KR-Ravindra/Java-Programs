import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateTimeExample
{
	public static void main(String args [])
	{
		LocalDate t1 = LocalDate.now();
		System.out.println("Curent Date:"+ t1);

		LocalDate t7 = LocalDate.of(1999,07,12);
		System.out.println("Current Date:"+ t7);
		
		LocalTime t2 = LocalTime.now();
		System.out.println("Current Time:"+ t2);

		LocalDateTime t3 = LocalDateTime.now();
		System.out.println("Current Date Time:"+ t3);
		System.out.println("Current Date Time:"+ LocalDateTime.now());
	}
}
