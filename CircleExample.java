class CircleExample
{
	double radius = 1.0;
	CircleExample()
	{
		System.out.println("In defult radius:" +radius);
	}
	CircleExample(double r)
	{
		radius = r;
		System.out.println("In parameterized double radius:" +radius);
	}
	void Area()
	{
		System.out.println(3.14*radius*radius);
	}
	public static void main(String [] args)
	{
		CircleExample c1 = new CircleExample();
		CircleExample c2 = new CircleExample(5.0);
		c1.Area();
		c2.Area();
		System.out.println("Radius by c1:" +c1.radius);
		System.out.println("Radius by c2:" +c2.radius);
	}
}
