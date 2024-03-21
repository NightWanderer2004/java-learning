import Punkt.Punkt;

public class Main {
    public static void main(String[] args) {
      double x = Double.parseDouble(args[0]);
      double y = Double.parseDouble(args[1]);

      Punkt punkt = new Punkt(x, y);

      System.out.println("X: " + punkt.getX());
      System.out.println("Y: " + punkt.getY());

      punkt.setX(10.0);
      punkt.setY(20.0);

      System.out.println("X po ustawieniu: " + punkt.getX());
      System.out.println("Y po ustawieniu: " + punkt.getY());
    }
}