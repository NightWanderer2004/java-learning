public class zad_9 {
   public static void main(String[] args) {
      outer:
      for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {
            if (i * j == 25) {
               break outer;
            }
         }
      }

      outer:
      for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {
            if (i * j == 25) {
               continue outer;
            }
         }
      }
   }
}
