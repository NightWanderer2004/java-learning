package Pak1;

// class Class1 - Nie dziedziczy po żadnej klasie
// final class Class1 - Nie może być dziedziczona
// private class Class1 - W ogóle nie ma takiego modyfykatora dostępu
// protected class Class1 - W ogóle nie ma takiego modyfykatora dostępu
public class Class1 {
    public int publicznePole;
    protected int chronionePole;
    private int prywatnePole;
    int domyslnePole;

    public Class1() {
        System.out.println("Konstruktor publiczny z pakietu Pak1");
    }

    public void metodaPubliczna() {
        System.out.println("Metoda publiczna z pakietu Pak1");
    }
    
    private void metodaPrywatna() {
        System.out.println("Metoda prywatna z pakietu Pak1");
    }

    protected void metodaChroniona() {
        System.out.println("Metoda chroniona z pakietu Pak1");
    }

    void metodaDomyslna() {
        System.out.println("Metoda domyślna z pakietu Pak1");
    }
}
