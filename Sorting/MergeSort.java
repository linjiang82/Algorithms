package Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
            right=copy(middle,len-1,arr);
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
        int idx;
        List<Integer> leftList = Arrays.stream(left).boxed().collect(Collectors.toList());
      List<Integer>  rightList = Arrays.stream(right).boxed().collect(Collectors.toList());
        if(leftList.size()==0) {
            return rightList.toArray(new int[]);
        }
      if(rightList.size()==0) {
          return leftList.toArray(new int[]);
      }
      if(leftList.get(0)>rightList.get(0)){
         resultArr[idx]=rightList.get(0);
         rightList.remove(0);
      }
      else {

          resultArr[idx]=leftList.get(0);
          leftList.remove(0);
      }

      return resultArr;
    }
}
