public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów Radio i Telewizja
        Radio radio = new Radio();
        Telewizja telewizja = new Telewizja();
        
        // Wywołanie metod
        radio.podajRodzaj();
        radio.info();
        radio.graj();
        
        telewizja.podajRodzaj();
        telewizja.info();
        telewizja.graj();
        telewizja.wyswietl();
    }
}