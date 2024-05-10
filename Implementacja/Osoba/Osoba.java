package Implementacja.Osoba;

abstract class Osoba {
    // Pola
    private String imie;
    private String nazwisko;
    
    // Konstruktor
    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    
    // Metody abstrakcyjne
    abstract String podajOpis();
    abstract String podajImie();
    abstract String podajNazwisko();
}