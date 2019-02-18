public class StringExample
{
	public static void main(String [] ar)
	{
		String s = "Hello Students.";
		String s1 = "Hello students.";

		System.out.println(s.charAt(3));
		System.out.println(s.startsWith("hello"));
		System.out.println(s.endsWith("ents."));
		boolean b = s.endsWith("ents.");
		System.out.print(b);
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.length());
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.indexOf('s',10));
		System.out.println(s1.lastIndexOf('s'));
		String ss = "one,two,three";
		String[] sa = ss.split(",");
		System.out.println("Length of a string is :" + length);
		String s11 = "welcome to Java";
		String s2  = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		String s4 = new String("Welcome to Java");
		System.out.println("s11 == s2 is "+ (s11 == s2));
		System.out.println("s11 == s3 is "+ (s11 == s3));
		System.out.println("s2 == s4 is"+(s2 == s4));
		String s5 = new String("Welcome");
		String s6 = "Welcomeab";
		if(s5.equals(s6))
		{
			System.out.println("s5 and s6 have the same contents.");

		}
		if(s5 == s6)
		{
			System.out.println("s5 and s6 have the same reference.");

		}
		if(s5.compareTo(s6)>0)
		{
			System.out.println("s5 is greater than s6."+s5.compareTo(s6));

		}
		else if(s5.compareTo(s6)==0)
		{
			System.out.println("s5 and s6 have the same contents."+s5.compareTo(s6));
		}
		else
			System.out.println("s5 is less than s6."+s5.compareTo(s6));


	}
}
