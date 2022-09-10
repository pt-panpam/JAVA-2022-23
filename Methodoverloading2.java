//methodover loading
import java.lang.*;
class OverloadDemo
{
void area(float x)
{
System.out.println("the area of the square is="+Math.pow(x,2)+"sq unit");
}
void area(float x,float y)
{
System.out.println("the are of rectangle is "+(x*y)+"sq unit");
}
void area(double x)
{
double z=3.14*x*x;
System.out.println("the are of Circle is "+z+"sq unit");
}
void area(double x,double y)
{
System.out.println("area of rectangle is"+(x*y));
}
}
class Methodoverloading2
{
public static void main(String[]args)
{
OverloadDemo ob=new OverloadDemo();
ob.area(5.1f);
ob.area(11,12);
ob.area(2.5);
ob.area(5.2f,6.1f);
ob.area(2.4,3.5);
ob.area(111);
}
}
