// JAVA Code For Trapping Rain Water 
import java.util.*; 

class TapWater { 
	
	static int findWater(int arr[], int n) 
	{ 
		// initialize output 
		int result = 0; 
		
		// maximum element on left and right 
		int left_max = 0, right_max = 0; 
		
		// indices to traverse the array 
		int lo = 0, hi = n-1; 
		
		while(lo <= hi) 
		{ 
			if(arr[lo] < arr[hi]) 
			{ 
				if(arr[lo] > left_max) 
	
				// update max in left 
				left_max = arr[lo]; 
				else
	
				// water on curr element = 
				// max - curr 
				result += left_max - arr[lo]; 
				lo++; 
			} 
			else
			{ 
				if(arr[hi] > right_max) 
				
				// update right maximum 
				right_max = arr[hi]; 
				
				else
				result += right_max - arr[hi]; 
				hi--; 
			} 
		} 
		
		return result; 
	} 
	static int findTapWater(int arr[], int n) {
	    int maxl = 0, maxr = 0;
	    int j =0 , len = n -1, res = 0;
	    while(j <= len){
	        if(arr[j] < arr[len]){
	            if(arr[j] > maxl){
	                maxl = arr[j];
	            } else{
	                res += maxl - arr[j];
	                j++;
	            }
	         } 
	        else {
	            
	                if(arr[len] > maxr){
	                    maxr = arr[len];
	                } else{
	                    res += maxr - arr[len];
	                    len--;
	                }
	           
	        }
	    }
	    return res;
	}
	static int findSum(int[] arr){
    int len = arr.length, sum =0;
    int leftmax = 0 , rightmax = 0 , i = 0 , j = len-1;
    while(i <= j){
      System.out.println(i);System.out.println(j);
      if(arr[i] < arr[j]){
        if(leftmax < arr[i] ){
            leftmax = arr[i];  
        }else {
            sum += leftmax - arr[i]; 
			i++;
        }
      } else {  
        if(rightmax < arr[j] ){
          rightmax = arr[j];
        } else {
           sum += rightmax - arr[j];  
		   j--;	
        }
      }
    }
    return sum;
  }
  static int findTW(int[] arr,int len){
    //int len = arr.length;
    int i=0 ,j = len-1, sum=0;
    int leftmax = 0 , rightmax =0;
    while(i <= j){
        if(arr[i] < arr[j]){
            if(leftmax < arr[i]){
                leftmax = arr[i];
            }else{
                sum +=leftmax - arr[i];
                i++;
            }
        } else{
            if(rightmax < arr[j]){
                rightmax = arr[j];
            }else{
                sum +=rightmax - arr[j];
                j--;
            }
        }
    }
    return sum;
  }
	/* Driver program to test above function */
	public static void main(String[] args) 
	{ 
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 
					3, 2, 1, 2, 1}; 
		int n = arr.length; 
		
		System.out.println("Maximum water that "
					+ "can be accumulated is "
					+ findWater(arr, n)); 
		System.out.println("Maximum water that "
					+ "can be accumulated is "
					+ findTapWater(arr, n)); 			
		System.out.println("Maximum water that "
					+ "can be accumulated is "
					+ findTW(arr, n)); 	
	} 
} 
// This code is contributed by Arnav Kr. Mandal.	 

