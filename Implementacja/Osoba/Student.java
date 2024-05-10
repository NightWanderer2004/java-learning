package Implementacja.Osoba;

class Student extends Osoba {
    // Pole
    private String specjalizacja;
    
    // Konstruktor
    Student(String imie, String nazwisko, String specjalizacja) {
        super(imie, nazwisko);
        this.specjalizacja = specjalizacja;
    }
    
    // Metoda zwracająca opis studenta
    String podajOpis() {
        return "Student: " + podajImie() + " " + podajNazwisko() + ", specjalizacja: " + specjalizacja;
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