import java.util.Scanner;
import java.lang.String;
public class w14_02
{
   public static void main(String args[])
   {
      Scanner scn=new Scanner(System.in);
      String str;
      System.out.print("輸入字串:");
      str=scn.nextLine();
      System.out.println("轉換成大寫: "+str.toUpperCase());
   }
}
