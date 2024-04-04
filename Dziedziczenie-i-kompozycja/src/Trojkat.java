public class Trojkat {

    public Trojkat(Punkt a, Punkt b, Punkt c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = a.odleglosc(b);
        this.bc = b.odleglosc(c);
        this.ca = c.odleglosc(a);
    }

    public Trojkat(double ab, double bc, double ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public double obwod() {
        return ab + bc + ca;
    }

    public double pole() {
        double s = obwod() / 2;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    public String klasyfikacja() {
        if (ab == bc && bc == ca) {
            return "równoboczny";
        }
        double[] boki = {ab, bc, ca};
        if (Math.round(boki[2] * boki[2]) == Math.round(boki[0] * boki[0] + boki[1] * boki[1])) {
            return "prostokątny";
        }
        if (boki[2] * boki[2] < boki[0] * boki[0] + boki[1] * boki[1]) {
            return "ostrokątny";
        } else {
            return "rozwartokątny";
        }
    }

    @Override
    public String toString() {
        String opis = "Trójkąt ";
        if (a != null && b != null && c != null) {
            opis += "zdefiniowany przez punkty: A" + a + ", B" + b + ", C" + c;
        } else {
            opis += "zdefiniowany przez długości boków: AB = " + ab + ", BC = " + bc + ", CA = " + ca;
        }
        opis += ". Obwód: " + obwod() + ", Pole: " + pole() + ". Klasyfikacja: " + klasyfikacja() + ".";
        return opis;
    }

    public static void main(String[] args) {
        Punkt a = new Punkt(0, 0);
        Punkt b = new Punkt(4, 0);
        Punkt c = new Punkt(0, 3);

        Trojkat trojkatPunkty = new Trojkat(a, b, c);
        System.out.println(trojkatPunkty);

        Trojkat trojkatBoki = new Trojkat(3, 4, 5);
        System.out.println(trojkatBoki);
    }
}
