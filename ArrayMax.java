package demo;
import java.util.Scanner;
public class ArrayMax {

	public static void main(String[] args) {
		int[] n1=new int[5];
		int temp=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element of the array");
		for(int i = 0;i<n1.length;i++)
		{
			n1[i]=sc.nextInt();
		}
		for(int i = 0;i<n1.length;i++)
		{
			if(temp<=n1[i])
				temp=n1[i];
		}
		System.out.println(temp);

	}

}
