public class LiczbaZespolona {
    double czescRzeczywista;
    double czescUrojona;

    public LiczbaZespolona(double czescRzeczywista, double czescUrojona) {
        this.czescRzeczywista = czescRzeczywista;
        this.czescUrojona = czescUrojona;
    }

    public double obliczModul() {
        return Math.sqrt(Math.pow(czescRzeczywista, 2) + Math.pow(czescUrojona, 2));
    }

    public double obliczKat() {
        return Math.atan2(czescUrojona, czescRzeczywista);
    }

    public void wyswietlLiczbeZesp() {
        System.out.println(czescRzeczywista + " + " + czescUrojona + "i");
    }
}