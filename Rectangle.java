import java.util.Scanner;
class Rectangle
{
	double l;
	double b;

	void Area(double x, double y)
	{
		System.out.println("Area : " + (x*y));
	}

	void Perimeter(double a, double b)
	{
		System.out.println("Perimeter : " + 2*(a+b));
	}

	public static void main(String [] args)
	{
		Rectangle r = new Rectangle();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length : ");
		r.l = s.nextDouble();
		System.out.print("Enter breadth : ");
		r.b = s.nextDouble();
		r.Area(r.l,r.b);
		r.Perimeter(r.l,r.b);
	}
}
