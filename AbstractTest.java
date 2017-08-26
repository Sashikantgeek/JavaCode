import java.util.*;
abstract class Person
{
	String name;
	void read()
	{
		System.out.println("input name");
		Scanner scan=new Scanner(System.in);
		name=scan.next();
	}
	abstract void print();
}
class Student extends Person
{
	int rno;
	void read()
	{
	System.out.println("input rno");
	Scanner scan=new Scanner(System.in);
	rno=scan.nextInt();
	super.read();
	}
	void print()
	{
		System.out.println(rno);
		System.out.println(name);
	}
}
class AbstractTest
{
	public static void main(String[] args) 
	{
		Student stud1=new Student();
		stud1.read();
		stud1.print();
		}
}
