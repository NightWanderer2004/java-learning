import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6};

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int index = Arrays.binarySearch(array, 3);
        System.out.println("Index of 3: " + index);

        int[] copy = Arrays.copyOf(array, array.length);
        System.out.println("Copy of array: " + Arrays.toString(copy));

        System.out.println("Array equals copy: " + Arrays.equals(array, copy));

        Arrays.fill(array, 0);
        System.out.println("Array after fill: " + Arrays.toString(array));
    }
}