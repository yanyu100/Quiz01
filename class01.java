
class CCircle                    
{
	int length;
	int width ;
	int height;
   double pi=3.14159;
   double radius;

   void Cal_area(double r)         
   {
      radius=r;
   }
   void Cal_area(int l ,int w ,int h )          
   {
	   length =l;
	   width =w;
	   height =h;
   }
   void Cal_area(double r,int l ,int w ,int h)  
   {
      radius = r;
      length = l;
	  width  = w;
	  height = h;
   }
   void show()
   {
      System.out.println("area="+Math.round(pi*radius*radius*radius*1.33333));
      System.out.println("surface area="+(length*width+length*height+height*width)*2);
   }
}

public class Class01.java
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();
      cir1.Cal_area(10.0);       
      cir1.show();

      cir1.Cal_area(4,5,6);   
      cir1.show();
   }
}
