public class Tramwaj extends Pojazd {
    private int liczbaPasazerow;

    // Konstruktor wieloparametrowy
    public Tramwaj(String marka, String rejestracja, int rokProdukcji, int liczbaPasazerow) {
        super(marka, rejestracja, rokProdukcji);
        this.liczbaPasazerow = liczbaPasazerow;
    }

    @Override
    public void drukujInformacje() {
        super.drukujInformacje();
        System.out.println("Liczba pasażerów: " + liczbaPasazerow);
    }
}
