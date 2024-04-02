public class TablicaTypow {
    public static void main(String[] args) {
        int[] intArray = new int[5];
      
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }
    }
}
