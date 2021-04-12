package Sorting;

public class BubbleSort {
    public static int[] sort(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {
            int i = 0;
            do {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } while (++i < (arr.length -1- j));
        }
        return arr;
    }
}
