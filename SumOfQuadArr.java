import java.util.*;

class SumOfQuadArr {
    static int findCount(int N){
        int count = 0; int n=2;
        while( 2*N + n - Math.pow(n, 2) > 0){
           double a = (2*N + n - Math.pow(n, 2)) / (2*n);
            if(a - (int) a == 0){
                System.out.println(a + " --> " + n);
                count +=1;
            }
            n++;
        }
        return count;
    }
    static int[] findArrSum(int arr[],int s){
        //int[] arr = {2,7,4,0,9,5,1,3};
        int n = arr.length;
        int[] result = {};
        if(arr == null || n < 4)
            return result;
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int k = j+1;
                int l = n-1;                
                while(k < l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum == s){
                         return new int[]{arr[i],arr[j],arr[k],arr[l]};
                    } else if(sum < s){
                        k++;
                    } else{
                       l--;
                    }
                }
            }
        
        }    
        return result; 
        
    }    
    static int[] findSum(int arr[],int s){
        //int[] arr = {2,7,4,0,9,5,1,3};
        int n = arr.length;
        int[] result = {};
        if(arr == null || n < 4)
            return result;
        Arrays.sort(arr);    
        for(int i =0;i<n-4;i++){
            for(int j =i+1;j<n-3;j++){
                int low = j+1;
                int high = n-1;
                int r = s - arr[i] + arr[j];
                while(low < high){
                    if(arr[low]+arr[high] < r){
                        low += 1; 
                    } else if(arr[low]+arr[high] > r){
                        high -=1;
                    } else{
                        return new int[]{arr[i],arr[j],arr[low],arr[high]};
                    }
                }
            }
        
        }    
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,0,9,5,1,3};
        int s = 20;
        //int[] res = findSum(arr,s); 
        //System.out.println(Arrays.toString(res));
        int[] res = findArrSum(arr,s); 
        System.out.println(Arrays.toString(res));
        System.out.println(findCount(100));
    }
}
