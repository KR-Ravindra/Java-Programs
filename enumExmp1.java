enum Month
{
	JANUARY,FEBUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
}
class enumExmp1
{
	public static void main(String [] args)
	{
		for(Month i : Month.values())
		{
			System.out.println(i);
		}
	}
}
