public class Firma {
    public static void main(String[] args) {
        Kierownik kierownik = new Kierownik("Jan", "Kowalski", 5000);
        kierownik.setPremie(1000);


        Pracownik[] pracownicy = new Pracownik[4];
        pracownicy[0] = kierownik;
        pracownicy[1] = new Pracownik("Anna", "Nowak", 3000);
        pracownicy[2] = new Pracownik("Piotr", "Wiśniewski", 3200);
        pracownicy[3] = new Pracownik("Olga", "Zalewska", 2800);

        for (Pracownik pracownik : pracownicy) {
            System.out.println(pracownik.getImie() + " " + pracownik.getNazwisko() + ", pensja: " + pracownik.getPensje());
            if (pracownik instanceof Kierownik) {
                System.out.println("To jest kierownik.");
            } else {
                System.out.println("To nie jest kierownik.");
            }
        }
    }
}
