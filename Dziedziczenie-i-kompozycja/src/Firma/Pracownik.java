public class Pracownik {
    private String imie;
    private String nazwisko;
    private double pensja;

    public Pracownik() {
        this.imie = "";
        this.nazwisko = "";
        this.pensja = 0.0;
    }

    public Pracownik(Pracownik pracownik) {
        this.imie = pracownik.imie;
        this.nazwisko = pracownik.nazwisko;
        this.pensja = pracownik.pensja;
    }

    public Pracownik(String imie, String nazwisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getPensje() {
        return pensja;
    }

    public void podwyzkaPensji(double oProcent) {
        pensja += pensja * oProcent / 100.0;
    }
}
