class BreakLoop
{
	public static void main(String arr[])
	{
		for(int i=0; i<100; i++)
		{
			if(i==10)break;
			//terminate loop if i is 10
			System.out.println("i:"+i);
		}
		System.out.println("Loop complete");
	}
}
