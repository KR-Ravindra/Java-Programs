class ForEach
{
   public static void main(String arr[])
   {
       int num[] = {1,2,3,4,5};
       int sum = 0;
       for(int i : num)
       {
          System.out.println("Value is:" +i);
          sum += i;
       }
       System.out.println("Sum is:" +sum);
   }
}
