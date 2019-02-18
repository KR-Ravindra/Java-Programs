import java.util.Scanner;
class Time
{
	public static void main(String [] args)
	{
		int input;
		int seconds;
		int minutes;
		final int MIN = 60;
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		minutes = (int)(input/MIN);
		seconds = (int)(input%MIN);
		System.out.println(input + " Seconds : " + minutes + " Minutes and " + seconds +  " Seconds");

	}
}
