package classProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int num,temp,rem,rev=0;
	System.out.print("enter the number:");
	num = sc.nextInt();
	temp=num;
	while(temp!=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if (num==rev)
	{
		System.out.println("The number is palindrome");
	}
	else
	{
		System.out.println("The number is not palindrome");
	}
	
	}

}
