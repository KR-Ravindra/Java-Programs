import java.util.Scanner;

class Calculator
{
   public static void main(String[] args)
   {
       char operator;
       Double num1, num2, result;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Enter operator (either +, -, *, /, %):");
       operator = input.next().charAt(0);
       System.out.println("Enter num1 and num2 respectively:");
       num1 = input.nextDouble();
       num2 = input.nextDouble();
       
       switch (operator)
       {
          case '+':
          	result = num1 + num2;
          	System.out.print(num1 + "+" + num2 + "=" + result);
          	break;
          
          case '-':
          	result = num1 - num2;
          	System.out.print(num1 + "-" + num2 + "=" + result);
          	break;
          	
          case '*':
          	result = num1 * num2;
          	System.out.print(num1 + "*" + num2 + "=" + result);
          	break;
          	
          case '/':
          	result = num1 / num2;
          	System.out.print(num1 + "/" + num2 + "=" + result);
          	break;
          	
          case '%':
          	result  = num1 % num2;
          	System.out.print(num1 + "%" + num2 + "=" + result);
          	break;
          	
          default:
          	System.out.println("Invalid Operator");
          	break;	
          
       }
   }
}
