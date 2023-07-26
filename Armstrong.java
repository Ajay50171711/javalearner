package practice;

import java.util.Scanner;

public class Armstrong{

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int num,temp,rem,sum=0;
	System.out.print("enter the number:");
	num = sc.nextInt();
	temp=num;
	while(temp!=0)     //logic for Armstrong number
	{
		rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
	}
	if (num==sum)
	{
		System.out.println("The number is armstrong");
	}
	else
	{
		System.out.println("The number is not armstrong");
	}
	
	}

}