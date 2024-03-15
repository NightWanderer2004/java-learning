public class zad_1 {
  public static void main(String[] args){
    int a = 10;
    int b = 12;
    int c = 14;
    
    System.out.println("Max: " + Math.max(a, Math.max(b, c)));
    System.out.println("Min: " + Math.min(a, Math.min(b, c)));
    System.out.println("Sqrt: " + Math.sqrt(a));
    System.out.println("Pow: " + Math.pow(a, 2));
    System.out.println("Abs: " + Math.abs(-a));
    System.out.println("Round: " + Math.round(3.14));
    System.out.println("Random: " + Math.random());
  }
}
