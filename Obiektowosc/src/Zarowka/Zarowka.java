package Zarowka;
public class Zarowka {
   public void zapalZarowke() {
      System.out.println("Zarowka zapalona");
   }
   public void zgasZarowke() {
      System.out.println("Zarowka zgaszona");
   }
   public void rozjasnijZarowke() {
      System.out.println("Zarowka rozjasniona");
   }
   public void przyciemnijZarowke() {
      System.out.println("Zarowka przyciemniona");
   }
   
   public static void main(String[] args) {
	   
	   Zarowka zw = new Zarowka();
	   
	   zw.zapalZarowke();
	   System.out.println();
	   
	   zw.rozjasnijZarowke();
	   zw.rozjasnijZarowke();
	   System.out.println();

	   zw.przyciemnijZarowke();
	   System.out.println();

	   zw.zgasZarowke();
   }
}
