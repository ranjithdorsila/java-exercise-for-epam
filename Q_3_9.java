import java.util.*;
public class Q_3_9
{
public static void main(String[] args)
{
int i,j=0,k;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[10];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
i=0;
int sum=0;
while(a[i]!=6)
{

sum=sum+a[i];
i++;
j=i;
}

while(a[i]!=7)
{
i++;
}
i++;
if(i==n && a[n-1]!=7)
{
while(j<n)
{

sum=sum+a[j];
j++;
}

}
else
{
while(i<n)
{

sum=sum+a[i];
i++;
}

}
System.out.println(sum);
}
}
