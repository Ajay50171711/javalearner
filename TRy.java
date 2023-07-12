package practice;
import java.util.Scanner;
public class TRy {

	public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a");
	a=sc.nextInt();
	System.out.println("Enter the value of b");
	b=sc.nextInt();
	try
	{
	c=a/b;
	System.out.println("a divide by b is :"+c);
	}
	catch(Exception e)
	{
		System.out.println("this process cant be done");
		System.out.println(e);
}
		System.out.println("end of program");
}
}
