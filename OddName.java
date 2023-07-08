package labprogram;
import java.util.Scanner;
public class OddName {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String name;
		
		   boolean check=false;
		System.out.println("Enter the name ");
		name=sc.nextLine();
		for(int i=0;i<name.length();i++)
		{
			char c = name.charAt(i);
			int ascii=c;
			if(ascii%2 != 0)
				 check=true;
			
			
		}
		if(check)
		{
		       System.out.println("Name is not odd");
    }
    else
    {
        System.out.println("Name is odd");
    }

	}

}
