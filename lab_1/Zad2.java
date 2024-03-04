import java.util.*;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj iloœæ liczb (N): ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Podawaj liczby:");

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int Number = scanner.nextInt();

                if (Number > max) {
                    max = Number;
                }

                System.out.println("Aktualnie najwiêksza liczba: " + max);
            }

            System.out.println("Najwiêksza liczba to: " + max);
        } else {
            System.out.println("Nale¿y podaæ liczbê dodatni¹.");
        }

        scanner.close();
    }
}
