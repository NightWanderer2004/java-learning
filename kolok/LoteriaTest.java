import java.util.*;

// Klasa reprezentująca gracza loterii
class Gracz {
    public String imie;
    private List<Kupon> kupony;

    public Gracz(){
         this.imie = "Anonim";
         this.kupony = new ArrayList<>();
    }

    public Gracz(String imie) {
        this.imie = imie;
        this.kupony = new ArrayList<>();
    }

    // Dodawanie kuponu do listy kuponów gracza
    public void dodajKupon(Kupon kupon) {
        kupony.add(kupon);
    }

    // Sprawdzanie wygranych gracza
    public int sprawdzWygrane() {
        int wygrana = 0;
        for (Kupon kupon : kupony) {
            wygrana += kupon.sprawdzWygrana();
        }
        return wygrana;
    }

    // Przeliczanie stawki dla gracza
    public void przeliczStawke() {
        // Przeliczanie stawki dla każdego kuponu gracza
        for (Kupon kupon : kupony) {
            kupon.przeliczStawke();
        }
    }
}

// Klasa reprezentująca kupon loterii
class Kupon {
    private List<Integer> liczby;
    private boolean wygrany;
    private int stawka;

    public Kupon(List<Integer> liczby) {
        this.liczby = liczby;
        this.wygrany = false;
        this.stawka = 0;
    }

    // Sprawdzanie wygranej na kuponie
    public int sprawdzWygrana() {
        // Tutaj implementacja logiki sprawdzającej wygraną na podstawie wylosowanych liczb
        // Zakładamy, że zwracana wartość to kwota wygranej
        return 120; // Na razie zwracamy 0 jako przykład
    }

    // Przeliczanie stawki dla kuponu
    public void przeliczStawke() {
        // Tutaj implementacja logiki przeliczającej stawkę kuponu
        // Zakładamy, że stawka jest przeliczana na podstawie różnych czynników, takich jak liczba trafionych liczb
        this.stawka = 10; // Na razie przeliczamy stawkę na stałą wartość 10 jako przykład
    }
}

public class LoteriaTest {
    public static void main(String[] args) {
        // Tworzenie gracza
        Gracz gracz = new Gracz("Jan Kowalski");

        // Tworzenie kuponów dla gracza
        List<Integer> liczbyKupon1 = Arrays.asList(10, 20, 30, 40, 50);
        Kupon kupon1 = new Kupon(liczbyKupon1);

        List<Integer> liczbyKupon2 = Arrays.asList(10, 20, 30, 40, 50);
        Kupon kupon2 = new Kupon(liczbyKupon2);

        // Dodawanie kuponów do gracza
        gracz.dodajKupon(kupon1);
        gracz.dodajKupon(kupon2);

        // Przeliczanie stawki dla gracza
        gracz.przeliczStawke();

        // Sprawdzanie wygranych gracza
        int wygrana = gracz.sprawdzWygrane();
        System.out.println("Wygrana gracza " + gracz.imie + ": " + wygrana + " zł");
    }
}