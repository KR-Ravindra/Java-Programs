import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	// Getting int input
    	System.out.print("Enter an integer: ");
    	int myInt = input.nextInt();
    	System.out.println("Integer entered " + myInt);
    	
    	// Getting float input
    	System.out.print("Enter float: ");
    	float myFloat = input.nextFloat();
    	System.out.println("Float entered = " + myFloat);
    	
    	// Getting double input
    	System.out.print("Enter double: ");
    	double myDouble = input.nextDouble();
    	System.out.println("Double entered = " + myDouble);
    	
    	// Getting String input
    	System.out.print("Enter text: ");
    	String myString = input.next();
    	System.out.println("Text entered = " + myString);
    }
}
