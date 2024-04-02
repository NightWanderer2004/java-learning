public class ClassTest {
    private int number;
    private String text;

   // Konstruktor bezparametrowy jest dostępny w dwóch sytuacjach:

   // Kiedy nie zdefiniowano żadnego konstruktora w klasie, kompilator Java automatycznie dostarcza konstruktor bezparametrowy.
   // Kiedy zdefiniowano konstruktor bezparametrowy w klasie.

    public ClassTest() {
        this.number = 0;
        this.text = "Default";
    }

   
    public ClassTest(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public static void main(String[] args) {
        ClassTest noParams = new ClassTest();
        System.out.println("Default object: " + noParams.number + ", " + noParams.text);

        ClassTest withParams = new ClassTest(5, "Custom");
        System.out.println("Custom object: " + withParams.number + ", " + withParams.text);
    }
}