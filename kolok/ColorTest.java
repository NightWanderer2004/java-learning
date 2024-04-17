import java.util.*;

class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String toString() {
        return "Color {" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}

public class ColorTest {
    public static void main(String[] args) {
        // Tworzymy zbiór TreeSet z naszym własnym Comparator'em
        TreeSet<Color> colors = new TreeSet<>(new ColorComparator());

        // Dodajmy kilka przykładowych kolorów
        colors.add(new Color(255, 0, 0)); // czerwony
        colors.add(new Color(0, 255, 0)); // zielony
        colors.add(new Color(0, 0, 255)); // niebieski

        // Wyświetlamy posortowane kolory
        for (Color color : colors) {
            System.out.println(color);
        }
    }

    // Definiujemy nasz własny Comparator dla kolorów
    static class ColorComparator implements Comparator<Color> {
        public int compare(Color c1, Color c2) {
            // Porównujemy najpierw wartości czerwone, jeśli są różne, to porównujemy po nich
            int redCompare = Integer.compare(c1.getRed(), c2.getRed());
            if (redCompare != 0) {
                return redCompare;
            }

            // Jeśli czerwone są takie same, porównujemy wartości zielone
            int greenCompare = Integer.compare(c1.getGreen(), c2.getGreen());
            if (greenCompare != 0) {
                return greenCompare;
            }

            // Jeśli zielone są takie same, porównujemy wartości niebieskie
            return Integer.compare(c1.getBlue(), c2.getBlue());
        }
    }
}