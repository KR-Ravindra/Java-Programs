public class StringBuilderExample
{
   public static void main(String [] ar)
   {
      StringBuilder sb = new StringBuilder("Hello my students");
      sb.append("xyz");
      System.out.println(sb);
      System.out.println(sb.length());
      sb.setLength(30);
      System.out.println(sb.length());
      System.out.println(sb);
      sb.setCharAt(2,'w');
      System.out.println(sb);
      sb.reverse();
      System.out.println(sb);
      sb.reverse();
      sb.insert(2,'y');
      System.out.println(sb);
      sb.deleteCharAt(5);
      System.out.println(sb);
      sb.delete(5,10);
      System.out.println(sb);
      System.out.println(sb.substring(5));
      System.out.println(sb);
      System.out.println(sb.substring(5,7));
      //System.out.println(sb.Capacity);
   }
}
