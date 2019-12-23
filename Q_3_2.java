import java.util.*;
public class Q_3_2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int max,min;
System.out.println("enter array size");
int n=sc.nextInt();
int a[]=new int[n];
a[0]=sc.nextInt();
max=a[0];
min=a[0];
for(int i=1;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]<min)
{
min=a[i];
}
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("max is "+max+" min is "+min);
}
}