import java.util.*;
class RandomRandom
{
	public static void main(String [] args)
	{
		int [] arr;
		int max;
		int count = 0;
		arr = new int[50];
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter range for random:");
		int n = s.nextInt();
		for(int i=0 ; i<50; i++)
		{
			arr[i] = r.nextInt(n);
		}
		for(int i=0; i<50; i++)
		{
			System.out.println(arr[i]);
		}

		max = arr[0];

		for(int i=0; i<50; i++)
		{
			if(arr[i] > max);
			{
				max = arr[i];
			}

			if(arr[i] == max)
			{
				count++;
			}
		}

		System.out.println("Largest of random numbers:" + max);
		System.out.println("Count of Largest number:" + count);
	}
}
