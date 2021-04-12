package Sorting;

public class CountSort {
    public static int[] sort( int[] arr){
        int[] newArr = new int[arr.length];
        int[] res = getRange(arr);
        int range = res[2];
        int min = res[0];
        int max = res[1];
        int idx =0;
        int[] counter = new int[range];
        for(int i=0;i<arr.length;i++){
            counter[arr[i]-min]++;
            }
        for(int i=0;i<counter.length;i++){
            while(counter[i]!=0){
                newArr[idx++]=i+min;
                counter[i]--;
            }
        }

        return newArr;
    }

    private static int[] getRange(int[] arr){
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]) min=arr[i];
            if(max<arr[i]) max = arr[i];
        }
        int[] res = new int[3];
        res[0] = min;
        res[1] = max;
        res[2] = max-min+1;
        return  res;

    }
}
