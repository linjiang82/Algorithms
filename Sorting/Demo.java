package Sorting;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 9, 2, 8, 77, 23, 13, 17, 13, 15, 0, 38, 56};

        long startTime = System.nanoTime();
//        arr = SelectSort.sort(arr);
//        arr = BubbleSort.sort(arr);
//        arr = InsertSort.sort(arr);
//        arr = ShellSort.sort(arr);
        arr = CountSort.sort(arr);
        long endTime = System.nanoTime();
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(endTime - startTime);
    }
}
