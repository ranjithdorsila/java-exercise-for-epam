import java.util.*;
public class Q_3_7
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[10];
int b[]=new int[10];
int i,j;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int k=0;
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
{
if(a[i]==b[j])
break;
}
if(i==j)
{
b[k]=a[i];
k++;
}
}

for(i=0;i<k;i++)
{
System.out.println(b[i]);
}
}
}