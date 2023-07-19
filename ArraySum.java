//Write a Java program to sum values of an array.

package thread;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args)
	{ int c=0;
		int[] a = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element  of the array");
		for(int i=0;i<3;i++)
		{
			
			a[i]=sc.nextInt();
			c=c+a[i];
		}
		System.out.println("Sum of element  of the array is:"+c);
	}

}
