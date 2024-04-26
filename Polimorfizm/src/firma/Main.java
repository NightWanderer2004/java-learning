package firma;
public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Jan", "Kowalski");
        Kierownik kierownik = new Kierownik("Anna", "Nowak", "123-456-789");

        wyswietlInformacje(pracownik);
        wyswietlInformacje(kierownik);
    }

    public static void wyswietlInformacje(Pracownik pracownik) {
        System.out.println(pracownik.toString());
    }
}