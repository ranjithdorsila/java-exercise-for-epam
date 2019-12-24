import java.util.*;
public class Q_3_5
{
public static void main(String[] args)
{
int ma_1,ma_2,mi_1,mi_2;
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int n=sc.nextInt();
int a[]=new int[n];
int i;
a[0]=sc.nextInt();
a[1]=sc.nextInt();
if(a[1]>a[0])
{
ma_1=a[1];
ma_2=a[0];
mi_1=a[0];
mi_2=a[1];
}
else
{
ma_1=a[0];
ma_2=a[1];
mi_1=a[1];
mi_2=a[0];
}
for(i=2;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]>ma_2)
{
if(a[i]>ma_1)
{
ma_2=ma_1;
ma_1=a[i];

}
else
{
ma_2=a[i];
}
}
if(a[i]<mi_2)
{
if(a[i]<mi_1)
{
mi_2=mi_1;
mi_1=a[i];
}
else
{
mi_2=a[i];
}
}
}
System.out.println("min1 "+mi_1+" min2 "+mi_2+" max1 "+ma_1+" max2 "+ma_2);
}
}