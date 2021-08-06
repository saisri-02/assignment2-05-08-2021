import java.util.*;
public class Possubarrays
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
for(int k=i;k<=j;k++)
{
System.out.print(a[k]);
}
System.out.println();
}
}
}
}

output:

3
1 2 3
1
12
123
2
23
3
