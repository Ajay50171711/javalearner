package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num,temp=0;
		System.out.print("enter the number:");
		num = sc.nextInt();
		for(int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				temp++;
			}
		}
			if(temp==2)
			{
				System.out.println("The number is prime");
			}
			else
			{
				System.out.println("The number is not prime");	
			}
		}
	

}
