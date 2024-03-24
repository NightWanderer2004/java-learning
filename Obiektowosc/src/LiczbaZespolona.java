public class LiczbaZespolona {
    double Re;
    double Jm;

    public LiczbaZespolona(double czescRzeczywista, double czescUrojona) {
        this.Re = czescRzeczywista;
        this.Jm = czescUrojona;
    }

    public double obliczModul() {
        return Math.sqrt(Math.pow(Re, 2) + Math.pow(Jm, 2));
    }

    public double obliczKat() {
        return Math.atan2(Jm, Re);
    }
    
    public void calculateValues() {
    	System.out.println("Modul: " + this.obliczModul());
    	System.out.println("Kąt: " + this.obliczKat());
    }
    
    public void printValues() {
    	System.out.println("Re: " + this.Re);
    	System.out.println("Jm: " + this.Jm);
    }
    
    public static void main(String[] args) {
    	LiczbaZespolona zesp = new LiczbaZespolona(18, 38);
    	zesp.printValues();
    	System.out.println();
    	zesp.calculateValues();
    }
}