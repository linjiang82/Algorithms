package Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSort {
    public static int[] sort(int[] arr) {
        int len = arr.length;
        if (len < 2)
            return arr;
        else {
            int middle;
            int[] left;
            int[] right;
            middle = Math.floorDiv(len, 2);
            left = copy(0, middle-1, arr);
            right = copy(middle, len - 1, arr);
            return merge(sort(left), sort(right));
        }
    }

    private static int[] copy(int start, int end, int[] arr) {
        int len = end - start+1;
        int[] resultArr = new int[len];
        if (len > 0) System.arraycopy(arr, start, resultArr, 0,  len);
        return resultArr;
    }

    private static int[] merge(int[] left, int[] right) {
        int len = left.length+right.length;
        int[] resultArr = new int[len];
        int idx = 0;
        List<Integer> leftList = Arrays.stream(left).boxed().collect(Collectors.toList());
        List<Integer> rightList = Arrays.stream(right).boxed().collect(Collectors.toList());
        if (leftList.size() == 0) {
            return right;
        }
        if (rightList.size() == 0) {
            return left;
        }
        while (rightList.size() > 0 && leftList.size() > 0) {
            if (leftList.get(0) > rightList.get(0)) {
                resultArr[idx++] = rightList.get(0);
                rightList.remove(0);
            } else {
                resultArr[idx++] = leftList.get(0);
                leftList.remove(0);
            }
        }
        if(leftList.size()==0){
            for (Integer integer : rightList) {
                resultArr[idx++] = integer;
            }
        }
        if(rightList.size()==0){
            for (Integer integer : leftList) {
                resultArr[idx++] = integer;
            }
        }

        return resultArr;
    }
}
