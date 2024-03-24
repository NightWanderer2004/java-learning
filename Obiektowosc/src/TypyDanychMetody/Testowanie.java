package TypyDanychMetody;

public class Testowanie {

	public static void main(String[] args) {

        Boolean b1 = true;
        System.out.println("Wartość b1: " + b1);

        boolean b2 = b1.booleanValue();
        System.out.println("Wartość b2: " + b2);


        char c1 = 'a';
        System.out.println("Wartość c1: " + c1);

        Character c2 = Character.valueOf(c1);
        System.out.println("Wartość c2: " + c2);

        System.out.println("Czy c1 jest wielką literą? " + Character.isUpperCase(c1));
       
        
        byte b3 = 123;
        System.out.println("Wartość b3: " + b3);

        Byte b4 = Byte.valueOf(b3);
        System.out.println("Wartość b4: " + b4);

        System.out.println("Maksymalna wartość typu byte: " + Byte.MAX_VALUE);


        short s1 = 32767;
        System.out.println("Wartość s1: " + s1);

        Short s2 = Short.valueOf(s1);
        System.out.println("Wartość s2: " + s2);

        System.out.println("Minimalna wartość typu short: " + Short.MIN_VALUE);


        int i1 = 1000000;
        System.out.println("Wartość i1: " + i1);

        Integer i2 = Integer.valueOf(i1);
        System.out.println("Wartość i2: " + i2);

        int i3 = Integer.parseInt("12345");
        System.out.println("Wartość i3: " + i3);
	}

}
