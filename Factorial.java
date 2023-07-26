//Program to find the factorial

package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num,factorial=1;
		System.out.print("enter the number:");
		num = sc.nextInt();
				for(int i =1 ; i<=num;i++)
				{
					factorial = factorial*i;  //logic of factorial
				}
				System.out.println("Factorial is:"+factorial);
	}

}
