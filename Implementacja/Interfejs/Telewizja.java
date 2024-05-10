class Telewizja extends Odbiornik implements Interfejs1, Interfejs2 {
    // Implementacja metody graj z Interfejs1
    public void graj() {
        System.out.println("Telewizja gra dźwięk.");
    }
    
    // Implementacja metody wyswietl z Interfejs2
    public void wyswietl() {
        System.out.println("Telewizja wyświetla obraz.");
    }
}