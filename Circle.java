class Circle 
{
	double radius = 1.0;
	Circle()
	{
		this(5.0);
		System.out.println("In default radius:" +radius);
	}
	Circle(double radius)
	{
		this.radius = radius;
		System.out.println("In parameterized constructor radius:"+radius);

	}
	public static void main(String [] args)
	{
		Circle c = new Circle();
		System.out.println("In main radius:" +c.radius);
	}
}
