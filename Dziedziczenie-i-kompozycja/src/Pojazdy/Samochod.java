public class Samochod extends Pojazd {
    private int mocSilnika;

    // Konstruktor wieloparametrowy
    public Samochod(String marka, String rejestracja, int rokProdukcji, int mocSilnika) {
        super(marka, rejestracja, rokProdukcji);
        this.mocSilnika = mocSilnika;
    }

    @Override
    public void drukujInformacje() {
        super.drukujInformacje();
        System.out.println("Moc silnika: " + mocSilnika);
    }
}
