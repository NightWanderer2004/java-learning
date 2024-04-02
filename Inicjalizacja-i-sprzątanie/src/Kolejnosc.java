public class Kolejnosc {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Initialization block");
    }

    public Kolejnosc() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Kolejnosc();
    }
}