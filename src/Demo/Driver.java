package Demo;

import java.util.*;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);;
		int k=0;
		BookOperation bo=new BookOperation();
		while(true)
		{
			System.out.println("Welcome To Book Management System");
			System.out.println("1.Add book\n2.Show all books\n3.Show available books\n4.Borrow book\n5.Return book\n6.exit");
			System.out.print("Enter the option:");
			int o=s.nextInt();
			switch(o)
			{
			case 1:bo.addBook();
			break;
			case 2:bo.showAllBooks();
			break;
			case 3:bo.showAvailableBooks();
			break;
			case 4:bo.borrowBook();
			break;
			case 5:bo.returnBook();
			break;
			case 6:k=1;
				break;
				
			//default:break;
			}
			if(k==1) {
				System.out.println("Thank You For Using Application");
				break;
			}
			System.out.println("\n\n");
			
		}
		
	}
}

