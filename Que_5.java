package Practice;

import java.util.*;

public class Que_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st no:");
		int a = sc.nextInt();

		System.out.println("Enter 2nd no:");
		int b = sc.nextInt();

		System.out.println("Enter 3rd no:");
		int c = sc.nextInt();

		// find Max no with if else logic
//< --less than   > --Greater than
		int largest;

		if (a >= b && a >= c) {
			largest = a;
		} else if (b >= a && b >= c) {
			largest = b;
		} else {
			largest = c;
		}
		System.out.println("The Largest no is:" + largest);
		sc.close();
	}

}
