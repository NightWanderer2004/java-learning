package firma;
public class Kierownik extends Pracownik{
   private String telefon;
   
   public Kierownik(String imie, String nazwisko, String telefon) {
      super(imie, nazwisko);
      this.telefon = telefon;
   }
   
   public String toString() {
      return super.toString() + " (" + telefon + ")";
   }
}

