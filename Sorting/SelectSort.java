package Sorting;

import java.util.Arrays;

public class SelectSort {
    public static int[] sort(int[] arr){
        int currentIdx =0;
        for( int i=currentIdx;i<arr.length;i++){
           int minIdx=currentIdx;
            for(int j=currentIdx;j<arr.length;j++){
               if(arr[minIdx]>arr[j]){
                   minIdx=j;
               }
            }
            int temp=arr[currentIdx];
            arr[currentIdx]=arr[minIdx];
            arr[minIdx]=temp;
            currentIdx++;
        }
    return arr;
    };

}
