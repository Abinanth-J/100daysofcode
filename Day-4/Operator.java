import java.io.*;
class Operator
{
public static void main(String args[])throws Exception
{
int a,b,operator;
double result=0;
DataInputStream d=new DataInputStream(System.in);
	try
	{
	System.out.println("Enter number1:");
	a=Integer.parseInt(d.readLine());
	System.out.println("Enter number2:");
	b=Integer.parseInt(d.readLine()); 
	System.out.println("1.Add(+) \n2.Subract(-) \n3.Multiply(*) \n4.Divide(/)");  
	System.out.println("Enter the operator:");
	operator=Integer.parseInt(d.readLine());
	switch(operator)
	{
	case 1:
	{
	result=a+b;
	break;
	}
	case 2:
	{
	result=a-b;
	break;
	}
	case 3:
	{
	result=a*b;
	break;
	}
	case 4:
	{
	result=(double)a/b;
	break;
	}
	}
	System.out.println("The Result is:"+result); 
	}
	catch(IOException e){
	}
}
}	 