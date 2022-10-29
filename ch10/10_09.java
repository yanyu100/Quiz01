class Caaa
{
   private int num;

   public void display() //(a)
   {
      System.out.println("printed from Caaa class");
   }
}
class Cbbb extends Caaa
{
   public void display()  //(b)
   {
      System.out.println("printed from Cbbb class");
   }
}
public class 10_09
{
   public static void main(String args[])
   {
      Caaa bb=new Cbbb(); //(c)
      bb.display();
   }
}
