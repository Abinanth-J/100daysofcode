import java.util.Scanner;
import java.io.*;
class greatestof3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a=");
int a=s.nextInt();
System.out.println("Enter b=");
int b=s.nextInt();
System.out.println("Enter c=");
int c=s.nextInt();
{
if(a>b&&a>c)
System.out.println("The greater number is"+a);
else if(b>a&&b>c)
System.out.println("The greater number is"+b);
else 
System.out.println("The greater number is"+c);
}
}
}