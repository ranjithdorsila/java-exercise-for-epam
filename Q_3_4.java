import java.util.*;
import java.lang.*;
public class Q_3_4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int n=sc.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

for(i=0;i<n;i++)
{

System.out.println((char)a[i]);
}
}
}