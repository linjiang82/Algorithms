package Sorting;

public class MergeSort {
    public static int[] sort(int[] arr){
        int len= arr.length;
        if(len<2)
            return arr;
        else{
            int middle;
            int[] left;
            int[] right;
                    middle = Math.floorDiv(len,2);
                    left=copy(0,middle,arr);
            right=copy(0,middle,arr);
            return merge(sort(left),sort(right));
        }
    }
    private static int[] copy(int start, int end, int[] arr){
        int len=end-start;
       int[] resultArr = new int[len];
       for(int i=start;i<end;i++){
           resultArr[i]=arr[i];
       }
       return resultArr;
    }
    private static int[] merge(int[] left, int[] right){
        int[] resultArr;
        if(left.length==0)
            return right;
        if(right.length==0)
            return left;
       if(left[0]<right[0]){
           resultArr[idx++]=left[0];
       }
       else resultArr[]
    }
}
