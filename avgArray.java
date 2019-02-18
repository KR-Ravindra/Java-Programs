import java.util.Scanner;
class avgArray
{
	public static void main(String [] args)
	{
		int [] arr;
		int n,count = 0,sum = 0;
		double avg;
		System.out.print("Enter no of elements : ");
                Scanner s = new Scanner(System.in);
                n = s.nextInt();
		arr = new int[n];
		System.out.println("Enter values in to array :");
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}

		for(int i=0; i<n; i++)
		{
			sum = sum + arr[i];
		}

		avg = sum/n;

		for(int i=0; i<n; i++)
		{
			if(arr[i] > avg)
			{
				count++;
			}
		}
		System.out.println("Average : " + avg);
		System.out.println("No of elements greater than average : " + count);

		short [] b;
		b = new short[n];
		for(int i=0; i<n; i++)
		{
			b[i] = (short)arr[i];
		}
		for(int i=0; i<n; i++)
		{
			System.out.println("Elements of array b" + b[i]);
		}
	}
}
