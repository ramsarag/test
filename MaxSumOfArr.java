import java.util.*;
class MaxSumOfArr {
//get max sum of element such that no adjacent element included {5,  5, 10, 40, 50, 35}
    public int maxSum(int arr[]){
        int len = arr.length;
        int incl = arr[0] , excl = 0, i, excl_new;
        for(i=1;i<len;i++){
            excl_new = (incl > excl) ? incl : excl;           
            incl = excl + arr[i]; 
            excl = excl_new;  
        }
        return (incl > excl) ? incl : excl;
    }
    public static void main(String args[]) {
        int arr[] = new int[]{5,  5, 10, 40, 50, 35};
        MaxSumOfArr ms = new MaxSumOfArr();
        int result = ms.maxSum(arr);
        System.out.print("result :" + result);
    }

}
