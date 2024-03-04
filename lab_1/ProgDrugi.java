import java.util.*;
public class ProgDrugi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("What is your name?");
		String name = in.nextLine();
		
		System.out.print("How old are you? ");
		int age = in.nextInt();
		
		System.out.println("Hello, " + name + "! In next year your age will be " + (age + 1) + " y.o.");
	}

}
