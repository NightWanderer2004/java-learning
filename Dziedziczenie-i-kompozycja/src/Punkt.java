public class Punkt {
    private double x;
    private double y;
    public Punkt() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punkt(double x) {
        this.x = x;
        this.y = 0.0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void ustawXY(Punkt punkt) {
        this.x = punkt.getX();
        this.y = punkt.getY();
    }
    public void ustawXY(double wspX, double wspY) {
        this.x = wspX;
        this.y = wspY;
    }
    public double odleglosc(Punkt punkt) {
        double dx = this.x - punkt.getX();
        double dy = this.y - punkt.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    @Override
    public String toString() {
        return "Name: " + this.getClass().getSimpleName() + ", x: " + this.x + ", y: " + this.y;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(3.0);
        Punkt p3 = new Punkt(4.0, 5.0);

        System.out.println("Punkt p1: " + p1);
        System.out.println("Punkt p2: " + p2);
        System.out.println("Punkt p3: " + p3);

        p1.ustawXY(2.0, 3.0);
        System.out.println("Punkt p1 po ustawieniu współrzędnych: " + p1);

        System.out.println("Odległość p1 od p3: " + p1.odleglosc(p3));

        System.out.println("Punkt p3: " + p3.toString());
    }
}
