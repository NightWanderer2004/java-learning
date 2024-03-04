import java.util.*;

public class Zad1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("a*x + b*x^2 + c = 0\n");
		
		System.out.print("Arg a: ");
		double a = in.nextDouble();
		
		System.out.print("Arg b: ");
		double b = in.nextDouble();
		
		System.out.print("Arg c: ");
		double c = in.nextDouble();
		
		System.out.print(a + "*x + " + b + "*x^2 + " + c + " = 0\n");

		double x = b * b - 4.0 * a * c;   
		if (x> 0.0)   
		{  
			double r1 = (-b + Math.pow(x, 0.5)) / (2.0 * a);  
			double r2 = (-b - Math.pow(x, 0.5)) / (2.0 * a);  
			System.out.println("x1 = " + r1 + " x2 = " + r2);  
		}
		
		else if (x == 0.0)   
		{  
			double r1 = -b / (2.0 * a);  
			System.out.println("x = " + r1);  
		}   
		
		else   
		{  
			System.out.println("Roots are not real.");  
		}  
	}

}
