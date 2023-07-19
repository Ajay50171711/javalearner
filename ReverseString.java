package practice;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		String reverse = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		for(int i = (str.length()-1);i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("the reverse String is:"+reverse);
	}

}
