public class Pojazd {
    private String marka;
    private String rejestracja;
    private int rokProdukcji;

    // Konstruktor wieloparametrowy
    public Pojazd(String marka, String rejestracja, int rokProdukcji) {
        this.marka = marka;
        this.rejestracja = rejestracja;
        this.rokProdukcji = rokProdukcji;
    }

    // Metoda do drukowania informacji o pojeździe
    public void drukujInformacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Rejestracja: " + rejestracja);
        System.out.println("Rok produkcji: " + rokProdukcji);
    }
}
