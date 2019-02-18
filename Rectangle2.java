class Rectangle2
{
	double l = 2.0;
	double b = 4.0;

	Rectangle2()
	{
	}

	Rectangle2(double x, double y)
	{
		l = x;
		b = y;
	}

	void Area()
	{
		System.out.println("Area:"+(l*b));
	}

	void Perimeter()
	{
		System.out.println("Perimeter:"+2*(l+b));
	}

	public static void main(String [] args)
	{
                Rectangle2 r1 = new Rectangle2();
		Rectangle2 r2 = new Rectangle2(5,6);
		r1.Area();
		r1.Perimeter();
		r2.Area();
		r2.Perimeter();
	}
}
