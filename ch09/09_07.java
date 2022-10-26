class Cmath
{
   public static void power(int x,int n)
   {
      int sum=1;
      for(int i=1;i<=n;i++)
         sum*=x;
      System.out.println(x+"次方"+n+"總數="+sum);
   }
}

public class 09_07
{
   public static void main(String args[])
   {
      Cmath.power(2,5);
      Cmath.power(3,2);
   }
}
