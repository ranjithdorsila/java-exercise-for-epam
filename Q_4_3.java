class Patient
{
String name;
double weight,height;
Patient(String name,double weight,double height)
{
this.name=name;
this.weight=weight;
this.height=height;
}
public double bmi()
{
return (weight/(height*height))*703;
}
}
public class Q_4_3
{
public static void main(String args[])
{
Patient p=new Patient("ranjith",30.0,40.0);
System.out.println(p.bmi());
}
}