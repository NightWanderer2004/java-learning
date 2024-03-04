import java.util.*;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilo�� liczb (N): ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Podawaj liczby:");

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int Number = scanner.nextInt();

                if (Number > max) {
                    max = Number;
                }

                System.out.println("Aktualnie najwi�ksza liczba: " + max);
            }

            System.out.println("Najwi�ksza liczba to: " + max);
        } else {
            System.out.println("Nale�y poda� liczb� dodatni�.");
        }

        scanner.close();
    }
}
