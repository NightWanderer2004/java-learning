package Implementacja.Osoba;

class Pracownik extends Osoba {
    // Pole
    private double pensja;
    
    // Konstruktor
    Pracownik(String imie, String nazwisko, double pensja) {
        super(imie, nazwisko);
        this.pensja = pensja;
    }
    
    // Metoda zwracająca pensję pracownika
    double podajPensje() {
        return pensja;
    }
    
    // Metoda zwracająca opis pracownika
    String podajOpis() {
        return "Pracownik: " + podajImie() + " " + podajNazwisko() + ", pensja: " + pensja;
    }
    
    // Metoda dodająca premię do pensji
    void premia(double procent) {
        pensja *= (1 + procent / 100);
    }
    
    // Implementacja metody podajImie z klasy abstrakcyjnej
    String podajImie() {
        return super.podajImie();
    }
    
    // Implementacja metody podajNazwisko z klasy abstrakcyjnej
    String podajNazwisko() {
        return super.podajNazwisko();
    }
}