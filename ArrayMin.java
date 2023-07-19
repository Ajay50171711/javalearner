package demo;
import java.util.Scanner;
public class ArrayMin {

	public static void main(String[] args) {
		int[] n1=new int[5];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element of the array");
		for(int i = 0;i<n1.length;i++)
		{
			n1[i]=sc.nextInt();
		}
		int smallest=n1[0];
		for(int i = 0;i<n1.length;i++)
		{
			if(n1[i]<=smallest)
				smallest=n1[i];
			
		}
		System.out.println(smallest);

	}

}
