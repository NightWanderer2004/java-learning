class TablicaObiektow {
    private int id;

    public TablicaObiektow(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TablicaObiektow: " + "id=" + id;
    }

    public static void main(String[] args) {
       TablicaObiektow[] objArray = new TablicaObiektow[5];
    
       for (int i = 0; i < objArray.length; i++) {
          objArray[i] = new TablicaObiektow(i);
       }
    
       for (int i = 0; i < objArray.length; i++) {
          System.out.println("Element at index " + i + ": " + objArray[i]);
       }
    }
}
