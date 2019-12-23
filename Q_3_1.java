import java.util.*;
public class Q_3_1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
int a[]=new int[n];
int sum=0;
float avg;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
avg=sum/n;
System.out.println("sum is "+sum+" avg is "+avg);
}
}

