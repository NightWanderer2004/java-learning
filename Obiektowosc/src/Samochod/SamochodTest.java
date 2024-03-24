package Samochod;

public class SamochodTest {
   public static void main(String[] args) {
      Samochod ford = new Samochod("Ford", "126p");
      Samochod opel = new Samochod("Opel", "Astra");
      Samochod bmw = new Samochod("BMW", "M5");
   
      ford.setModel("Mustang");
      ford.wyswietlInformacje();

      opel.setModel("Corsa");
      opel.wyswietlInformacje();

      bmw.setModel("X5");
      bmw.wyswietlInformacje();
   }
}
