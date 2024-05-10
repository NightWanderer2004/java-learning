package Implementacja.Figura;
class Prostokat extends Figura {
    private double dlugosc;
    private double szerokosc;

    // Konstruktor
    Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    // Implementacja metody obliczPole dla Prostokąta
    double obliczPole() {
        return dlugosc * szerokosc;
    }

    // Implementacja metody obliczObwod dla Prostokąta
    double obliczObwod() {
        return 2 * (dlugosc + szerokosc);
    }
}