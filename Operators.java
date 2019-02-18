public class Operators{
	public static void main(String[]args){
		byte b1=64;
		int a=51;
		int b=60;
		b1=(byte)(b1>>2);
		int x=0;
		int y=10;
		int studentgrade=61;
		byte z=-16;
		System.out.println("Welcome to Java!");
		System.out.println("Addition of a and b:"+(a+b));
		System.out.println("Subtration of and b:"+(a-b));
		System.out.println("Multiplication of and b:"+(a*b));
		System.out.println("Division of and b:"+(a/b));
		//System.out.println("Logic And of a and b:"+(a&b));
		System.out.println("Right Shift of b1:"+b1);
		//System.out.println(x!=0 & (y/x)>2);
		System.out.println(x!=0 && (y/x)>2);
		System.out.println(studentgrade>=60 ? "Passed":"Failed");
		System.out.println(-16>>2);
		System.out.println(-64>>>2);
}}
