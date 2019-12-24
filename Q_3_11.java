import java.util.*;
public class Q_3_11
{
public static void main(String[] a)
{
int i,n,k=0,j,max;
int b[][]=new int[3][3];
n=a.length;

if(n==9)
{
max=Integer.parseInt(a[0]);
System.out.println("given array is :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=Integer.parseInt(a[k]);
System.out.print(b[i][j]+" ");
if(b[i][j]>max)
max=b[i][j];
k++;
}
System.out.println();
}
System.out.println("max in array is:"+max);
}

else
{
System.out.println("please enter 9 integer numbers");
}
}
}