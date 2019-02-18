import java.util.Scanner;
enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY;
}
public class SwitchEnum{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String Status;
		System.out.print("Enter Status : ");
		Status = s.nextLine();
		Day d;
		d = Day.valueOf(Status);
		switch(d){
			case SUNDAY : System.out.println("Computed SUNDAY");
		        break;

		        case MONDAY : System.out.println("Computed MONDAY");
		        break;

			case TUESDAY: System.out.println("Computed TUESDAY");
                        break;

	                case WEDNESDAY : System.out.println("Computed WEDNESDAY");
                        break;

		        default: System.out.println("kathlu");
                        break;


		}
	}
}
