package Tablica;
import java.util.Arrays;
import java.util.Scanner;

public class Tablica {
    private double[] array;

    public Tablica(int size) {
        array = new double[size];
    }

    public void readArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Podaj element " + i + ": ");
            array[i] = scanner.nextDouble();
        }
    }

    public void printArray() {
        for (double i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public double average() {
        double sum = 0;
        for (double el : array) {
            sum += el;
        }
        return sum / array.length;
    }

    public double max() {
        double max = array[0];
        for (double el : array) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

    public double min() {
        double min = array[0];
        for (double el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void resize(int newSize) {
        double[] newArray = new double[newSize];
        System.arraycopy(array, 0, newArray, 0, Math.min(array.length, newSize));
        array = newArray;
    }
}
