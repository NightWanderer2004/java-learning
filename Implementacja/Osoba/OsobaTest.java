package Implementacja.Osoba;

public class OsobaTest {
    public static void main(String[] args) {
        // Tworzenie obiektów Pracownik i Student
        Pracownik pracownik = new Pracownik("Jan", "Kowalski", 5000);
        Student student = new Student("Adam", "Nowak", "Informatyka");
        
        // Wyświetlanie opisów
        System.out.println(pracownik.podajOpis());
        System.out.println(student.podajOpis());
        
        // Dodanie premii do pensji pracownika
        pracownik.premia(10);
        System.out.println("Po dodaniu premii: " + pracownik.podajOpis());
    }
}