public class Inicjalizacja {
    private int number;
    private static int staticNumber;
   
    {
        number = 10;
    }

    static {
        staticNumber = 20;
    }

    public static void main(String[] args) {
        Inicjalizacja test = new Inicjalizacja();
        System.out.println("Inicjalizacja: " + test.number);
        System.out.println("Statyczna inicjalizacja: " + Inicjalizacja.staticNumber);
    }
}