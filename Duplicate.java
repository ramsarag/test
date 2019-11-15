import java.io.*;
import java.util.*;

class Duplicate {

  static int[] findDuplicates(int[] arr) {
    // your code goes here
    int[] result = {};
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++){
        int index = Math.abs(arr[i]) -1;
        if(arr[index] < 0){
            result[i] = Math.abs(arr[i]);
        } else{
            arr[index] = -arr[index];
        }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] input = {2,-1,2,1,2};
     System.out.println(Arrays.toString(findDuplicates(input)));
  }

}
