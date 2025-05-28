package Practice;

import java.util.*;

public class Que_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your user id:");
		String Userid=sc.nextLine();
		
		//check the user id
		
		if(Userid.equals("Mayur2002")) {
			System.out.println("Name:Mayur");
			System.out.println("Age:23");
		}	
		else {
			System.out.println("User Id not match");
			sc.close();
		}
	}
}
