class Circle1
{
	double radius = 4;
	Circle1()
	{
		System.out.println("radius :" + radius);
	}

	Circle1(double newRadius)
	{
		newRadius = radius;
		System.out.println("In parametrized Constructor Radius:"+newRadius);
	}

	void getArea(double radius)
	{
		double area = 3.14*radius*radius;
		System.out.println(area);
	}

	void getPerimeter(double radius)
	{
		double perimeter = 2*3.14*radius;
		System.out.println(perimeter);
	}

	void setRadius(double newRadius)
	{
		radius = newRadius;
		System.out.println("New radius:"+ radius);
	}

	public static void main(String [] args)
	{
		Circle1 c1 = new Circle1();
		c1.setRadius(4.3);
		c1.getArea(c1.radius);
		c1.getPerimeter(c1.radius);
	}
}
