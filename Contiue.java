class Continue
{
   public static void main(String arr[])
   {
       for(int i=0; i<5; i++)
       {
          System.out.println(i+"");
          if(i%2==0)continue;
          System.out.println("No Continue");
       }
   }
}
