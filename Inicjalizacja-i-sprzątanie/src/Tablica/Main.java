package Tablica;

public class Main {
    public static void main(String[] args) {
        Tablica tablica = new Tablica(5);
        tablica.readArray();
        tablica.printArray();
        System.out.println("Średnia: " + tablica.average());
        System.out.println("Max: " + tablica.max());
        System.out.println("Min: " + tablica.min());
        tablica.sort();
        tablica.printArray();
        tablica.resize(7);
        tablica.printArray();
    }
}