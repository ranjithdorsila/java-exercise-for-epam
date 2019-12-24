import java.util.*;
class Box
{
double width,height,depth;
public void initialize(double width,double height,double depth)
{
this.width=width;
this.height=height;
this.depth=depth;
}
public double volume()
{
return width*height*depth;
}
}
public class Q_4_1
{
public static void main(String[] args)
{
Box b=new Box();
b.initialize(10.0,20.0,30.0);
System.out.println(b.volume());
}
}