public class Kierownik extends Pracownik {
    private double premia;

    public Kierownik() {
        super();
        this.premia = 0.0;
    }

    public Kierownik(Pracownik pracownik) {
        super(pracownik);
        this.premia = 0.0;
    }

    public Kierownik(String imie, String nazwisko, double pensja) {
        super(imie, nazwisko, pensja);
        this.premia = 0.0;
    }

    @Override
    public double getPensje() {
        return super.getPensje() + premia;
    }

    public void setPremie(double premia) {
        this.premia = premia;
    }
}
