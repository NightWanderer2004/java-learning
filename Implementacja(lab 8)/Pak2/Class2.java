package Pak2;

public class Class2 extends Pak1.Class1 {
    public Class2() {
        System.out.println("Konstruktor publiczny z pakietu Pak2");
    }

    public void testowanieDostepnosci() {
//      domyslnePole = 0; Nie dziala - niema dostepu
        publicznePole = 1;
        chronionePole = 2;
//      prywatnePole = 3; Nie dziala - niema dostepu
        
        metodaPubliczna();
//      metodaPrywatna(); Nie dziala - niema dostepu
        metodaChroniona();
//      metodaDomyslna(); Nie dziala - niema dostepu
    }
}
