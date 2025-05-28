package Practice;
import java.util.*;

public class Que_11 {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter radius of circle:");
	double radius=sc.nextDouble();
	
	//sometimes radius is in decimal nos
	
double area=3.14*radius*radius;

System.out.println("Area of circle:" +area);

double circumference=2*3.14*radius;
System.out.println("The Circumference of circle is:"+circumference);
		
		sc.close();
	}

}
