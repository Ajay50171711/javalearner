package array;
import java.util.Scanner;
public class AddMatrix {

	public static void main(String[] args) {
		int i,j;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter the element of a:");
		Scanner sc=new Scanner(System.in);
		for( i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the element of b:");
		for(i=0;i<b.length;i++)
		{
			for( j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("the element of a is:");
		for ( i =0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
	}
		System.out.println("the element of b is:");
		for ( i =0;i<b.length;i++)
		{
			for( j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
	}
		for(i=0;i<c.length;i++)
		{
			for( j=0;j<c.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			}
		System.out.println("the addition of matrix is :");
		for ( i=0;i<c.length;i++)
		{
			for( j=0;j<c.length;j++)
			{
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
	}
		
	}

}
