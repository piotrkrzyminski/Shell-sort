package pl.piotrkrzyminski;

public class Main {
    public static void main(String[] args) {
        long[] sortArray = new long[100];
        int[] gapsArray = {701, 301, 132, 57, 23, 10, 4, 1};
        fillArray(sortArray);

        System.out.println("Before sorting");
        print(sortArray);

        try {
            Shellsort.sort(sortArray,gapsArray);
        } catch (SortException e) {
            e.printStackTrace();
        }

        System.out.println("After sorting");
        print(sortArray);
    }

    public static void fillArray(long[] array) {
        for(int i=0; i<array.length; i++) {
            array[i] = (int)(Math.random() * 1000 + 1);
        }
    }

    public static void print(long[] array) {
        for(long value : array) {
            System.out.print(value + " ");
        }
        System.out.print('\n');
    }
}
