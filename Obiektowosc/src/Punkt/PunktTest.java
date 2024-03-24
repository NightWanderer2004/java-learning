package Punkt;

import java.util.Scanner;

public class PunktTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	double x = scanner.nextDouble(); 
    	double y = scanner.nextDouble();    	

    	
        Punkt p1 = new Punkt(0, 0);
        Punkt p2 = new Punkt(12, 32);

        System.out.println("Punkt 1: ");
        p1.printValues();
        
        System.out.println("\nPunkt 2: ");
        p2.printValues();
        
        
        p1.setX(x);
        p1.setY(y);

        System.out.println("\nPunkt 1 nowy: ");
        System.out.println("X po ustawieniu: " + p1.getX());
        System.out.println("Y po ustawieniu: " + p1.getY());

	}

}
