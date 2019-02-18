import java.util.scanner;
public class ArrayExample
{
   public static void main(String [] args)
   {
      int [] a; //to declare array
      a = new int[10]; //to create and initialize array
      int [] b = new int[10]; // declaring and creating array
      
      Scanner s = new Scanner(System.in);
      System.out.println("Enter value for array");
      for(int i=0; i<10; i++)
      {
         a[i] = s.nextInt();
      }
      System.out.println("Entered values in array a:");
      for(int i=0; i<10; i++)
      {
         System.out.println(a[i]);
         
      }
      
      int [] d={3,5,6,8,90,100}; // declaration, creation and initialization in one step
      System.out.println("Entered values in array d:");
      for(int i=0; i<d.length; i++)
      {
         System.out.println(d[i]);
      }
   }
}
