package Sorting;

public class ShellSort {
    public static int[] sort(int[] arr){
        for(int interval=arr.length/2;interval>0;interval/=2){
            for(int j=interval;j<arr.length;j++){
                int temp=arr[j];
                for(int i=j;i-interval>=0&&arr[i-interval]>temp;i-=interval){
                    arr[i]=arr[i-interval];
                    arr[i-interval]=temp;
                }

            }
        }
       return arr;
    }
}
