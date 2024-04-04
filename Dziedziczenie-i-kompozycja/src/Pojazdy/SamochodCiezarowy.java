public class SamochodCiezarowy extends Samochod {
    private int ladownosc;

    // Konstruktor wieloparametrowy
    public SamochodCiezarowy(String marka, String rejestracja, int rokProdukcji, int mocSilnika, int ladownosc) {
        super(marka, rejestracja, rokProdukcji, mocSilnika);
        this.ladownosc = ladownosc;
    }

    @Override
    public void drukujInformacje() {
        super.drukujInformacje();
        System.out.println("Ładowność: " + ladownosc);
    }
}
