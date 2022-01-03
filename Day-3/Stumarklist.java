import java.io.*;
class Stumarklist
{
public static void main(String arg[])throws IOException
{
int id,m1,m2,m3;
String name;
DataInputStream d=new DataInputStream(System.in);
{
System.out.println("\tSTUDENT MARK LIST ENTRY FORM");
System.out.println("Enter your Name:");
name=d.readLine();
System.out.println("Enter your id:");
id=Integer.parseInt(d.readLine());
System.out.println("Enter Mark 1:");
m1=Integer.parseInt(d.readLine());
System.out.println("Enter Mark 2:");
m2=Integer.parseInt(d.readLine());
System.out.println("Enter Mark 3:");
m3=Integer.parseInt(d.readLine());
}
System.out.println("Name\tId\tMark1\tMark2\tMark3\tTotal");
System.out.println(name+"\t"+id+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+(m1+m2+m3));
}
}		