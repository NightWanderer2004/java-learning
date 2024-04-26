package figura;

public class FiguraTest {
   public void rysujFigure(Figura figura) {
      figura.rysuj();
   }

   public static void main(String[] args) {
      FiguraTest figuraTest = new FiguraTest();
      Figura trojkat = new Trojkat();
      Figura prostokat = new Prostokat();
      Figura okrag = new Okrag();
      figuraTest.rysujFigure(trojkat);
      figuraTest.rysujFigure(prostokat);
      figuraTest.rysujFigure(okrag);
   }
}
