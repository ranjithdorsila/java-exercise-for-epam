import java.util.*;
public class Q_3_10
{
public static void main(String[] a)
{
int i,n,k=0,j;
n=a.length;
int b[][]=new int[2][2];
if(n==4)
{
System.out.println("given array is");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j]=Integer.parseInt(a[k]);
k++;
System.out.print(b[i][j]+" ");
}
System.out.println();
}
System.out.println("reverse array is");
for(i=1;i>=0;i--)
{
for(j=1;j>=0;j--)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
else
{
System.out.println("please enter 4 integer numbers");
}
}
}