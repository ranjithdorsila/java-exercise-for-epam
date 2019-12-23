import java.util.*;
public class Q_3_3
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
System.out.println("enter key");
int k=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==k)
break;
}
if(i==n)
System.out.println("-1");
else
System.out.println(i);
}
}