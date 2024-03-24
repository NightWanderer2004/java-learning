public class Testowanie {
    public static void main(String[] args) {
        int liczba = 42;
        System.out.println(liczba);
        System.out.println(Integer.toString(liczba));
        System.out.println(Integer.valueOf(liczba));

        double liczbaDouble = 3.14;
        System.out.println(liczbaDouble);
        System.out.println(Double.toString(liczbaDouble));
        System.out.println(Double.valueOf(liczbaDouble));

        char znak = 'A';
        System.out.println(znak);
        System.out.println(Character.toString(znak));
        System.out.println(Character.valueOf(znak));

        String napis = "Hello, world!";
        System.out.println(napis);
        System.out.println(napis.length());
        System.out.println(napis.charAt(0));
        System.out.println(napis.toUpperCase());

        boolean prawda = true;
        System.out.println(prawda);
        System.out.println(Boolean.toString(prawda));
        System.out.println(Boolean.valueOf(prawda));

        byte bajt = 100;
        System.out.println(bajt);
        System.out.println(Byte.toString(bajt));
        System.out.println(Byte.valueOf(bajt));

        short krotka = 1000;
        System.out.println(krotka);
        System.out.println(Short.toString(krotka));
        System.out.println(Short.valueOf(krotka));
    }
}


