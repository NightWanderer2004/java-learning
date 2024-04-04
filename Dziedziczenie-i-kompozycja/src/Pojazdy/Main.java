public class Main {
    public static void main(String[] args) {
        // Tworzenie różnych pojazdów
        Samochod osobowy = new Samochod("Toyota", "ABC123", 2018, 150);
        SamochodCiezarowy ciezarowy = new SamochodCiezarowy("Volvo", "XYZ456", 2015, 250, 5000);
        Tramwaj tramwaj = new Tramwaj("Siemens", "WRO789", 2020, 100);

        // Wyświetlanie informacji o pojazdach
        System.out.println("Informacje o samochodzie osobowym:");
        osobowy.drukujInformacje();

        System.out.println("\nInformacje o samochodzie ciężarowym:");
        ciezarowy.drukujInformacje();

        System.out.println("\nInformacje o tramwaju:");
        tramwaj.drukujInformacje();
    }
}
