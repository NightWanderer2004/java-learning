import java.util.*;

public class ImionaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> pary = new HashMap<>();

        // Pobieranie imion par od użytkownika
        System.out.println("Podaj imiona par (wpisz '-' aby zakończyć):");
        while (true) {
            System.out.print("Podaj imię pierwszej osoby: ");
            String imie1 = scanner.nextLine();
            if (imie1.equals("-")) {
                break;
            }
            System.out.print("Podaj imię drugiej osoby: ");
            String imie2 = scanner.nextLine();
            if (imie2.equals("-")) {
                break;
            }
            pary.put(imie1, imie2);
        }

        // Wyświetlanie imion partnerów
        System.out.print("Podaj imię osoby, dla której chcesz poznać partnera: ");
        String imie = scanner.nextLine();
        if (pary.containsKey(imie)) {
            String partner = pary.get(imie);
            System.out.println("Partner " + imie + " to " + partner);
        } else {
            System.out.println("Nie znaleziono partnera dla podanego imienia.");
        }
    }
}