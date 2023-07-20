/*Create a user defined class to store Books information
(bookid, title, author name, price)
Add 5 books record into vector and display the same 
information from vector.*/

package lab20;
import java.util.*;
public class Books {
	 int bookid;
     String title;
     String authorName;
     double price;

    public Books(int bookid, String title, String authorName, double price) {
        this.bookid = bookid;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

public static void main(String[] args) {
		Books b1=new Books(1,"The man","Ajay",267);
		Books b2=new Books(2,"He man","Ajay Kumar",268);
		Books b3=new Books(3,"man","jay",287);
		Books b4=new Books(12,"The manss","Aa jay",467);
		Books b5=new Books(14,"The_man","__Ajay",260);
		
		
		Vector v1=new Vector(5);//create a vector
		
		
		//add object in vector
		v1.addElement(b1);
		v1.addElement(b2);
		v1.addElement(b3);
		v1.addElement(b4);
		v1.addElement(b5);
		
		//to display output
		
		for (int i = 0; i < v1.size(); i++) {
		    Books book = (Books) v1.elementAt(i);
		    System.out.println("Book ID:" + book.bookid);
		    System.out.println("Title:" + book.title);
		    System.out.println("Author:" + book.authorName);
		    System.out.println("Price:" + book.price);
		    System.out.println();
		}

	}

}
