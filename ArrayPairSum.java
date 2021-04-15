import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPairSum {
    public static void arrayPairSum(List<Integer> arr, int k){
        while(arr.size()>0){
         int    firstNum = arr.remove(0);
            if(arr.contains(k-firstNum)){
                int idx = arr.indexOf(k-firstNum);
                arr.remove(idx);
                System.out.printf("%d,%d%n",firstNum,k-firstNum);
            }

        }
    }

    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 9, 8, 7, 6, 4, 3));
        long startTime = System.nanoTime();
        ArrayPairSum.arrayPairSum(arr,10);
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);

    }
}
