package Practice;
import java.util.*;
public class Que_9 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the No1:");
		int No1=sc.nextInt();
		
		System.out.println("Enter the No2:");
		int No2=sc.nextInt();
		
		int Sub =No1-No2;
		
		System.out.println("Difference between two Nos are:" +Sub);
		sc.close();
	}

}
