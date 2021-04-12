package Sorting;

public class InsertSort {
    public static int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            boolean swapped=false;
            int j=i;
            do{
                if(arr[j]>arr[j-1]){
                    swapped=false;
                }
                else {
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }while(swapped && --j>0);
        }
        return arr;
    }
}
