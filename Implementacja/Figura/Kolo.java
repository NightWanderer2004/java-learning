package Implementacja.Figura;
class Kolo extends Figura {
    private double promien;

    // Konstruktor
    Kolo(double promien) {
        this.promien = promien;
    }

    // Implementacja metody obliczPole dla Koła
    double obliczPole() {
        return Math.PI * Math.pow(promien, 2);
    }

    // Implementacja metody obliczObwod dla Koła
    double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}
