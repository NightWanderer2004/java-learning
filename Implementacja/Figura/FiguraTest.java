package Implementacja.Figura;
public class FiguraTest {
    public static void main(String[] args) {
        // Tworzenie obiektów Kolo i Prostokat
        Kolo kolo = new Kolo(5);
        Prostokat prostokat = new Prostokat(4, 6);
        
        // Wyświetlanie pól i obwodów
        System.out.println("Pole koła: " + kolo.obliczPole());
        System.out.println("Obwód koła: " + kolo.obliczObwod());
        
        System.out.println("Pole prostokąta: " + prostokat.obliczPole());
        System.out.println("Obwód prostokąta: " + prostokat.obliczObwod());
    }
}