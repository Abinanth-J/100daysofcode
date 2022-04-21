import java.io.*;
import java.util.*;
class primeornot
{
public static void main(String args[])throws IOException
{
DataInputStream d=new DataInputStream (System.in);
int a,i,p=0;
System.out.println("Enter the number");
a=Integer.parseInt(d.readLine());
for(i=2;i<=a/2;i++)
if(a%i==0)
{
p=1;
break;
}
if(p!=1)
System.out.println("The prime is "+a);
else
System.out.println("The number "+a+" is not a prime");
}
}