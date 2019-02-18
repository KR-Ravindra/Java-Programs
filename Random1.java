import java.util.*;
class Random1
{
	public static void main(String [] args)
	{
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter Random range:");
		//int n = s.nextInt();
		for(int i=0; i<10; i++)
		{
			System.out.println(5+r.nextInt(4));
		}
	}
}
