package firma;
public class Pracownik {
      private String imie;
      private String nazwisko;
   
      public Pracownik(String imie, String nazwisko) {
         this.imie = imie;
         this.nazwisko = nazwisko;
      }

      public String toString() {
         return imie + " " + nazwisko;
      }
}