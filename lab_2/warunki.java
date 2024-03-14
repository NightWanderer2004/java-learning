public class warunki {
   public static void main(String[] args) {
      // if
      int i = 0;
      if (i == 4){
         System.out.println("i = 4");
      } else {
         System.out.println("i != 4");
      }

      // switch
      switch (i){
         case 0:
            System.out.println("zero");
         break;
         case 1:
            System.out.println("jeden");
         break;
         default:
            System.out.println("inny");
      }
   }
}
