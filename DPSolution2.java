import java.io.*;
import java.util.*;

class DPSolution2 {

  static int helperDP(char[] data,int k, int[] memo) {
    if(k==0)
      return 1;
    int len = data.length -k;
    if(data[len] == '0')
      return 0;
    if(memo[k] !=-1)
      return memo[k];
    int result = helperDP(data,k-1,memo);
    char b1[] = Arrays.copyOfRange(data, len, len+2);
    StringBuilder sb = new StringBuilder(3);
    sb.append(b1[0]);sb.append(b1[1]);
    int val = Integer.valueOf(sb.toString().trim());
    if(k >= 2 && val <= 26){
      result +=helperDP(data,k-2,memo);
    }
    memo[k] = result;
    return result;
  }    
      
  
	static int decodeVariations(String S) {
		// your code goes here
    int len = S.length();
    int[] memo = new int[len+1];
    Arrays.fill(memo,-1);
    char[] data = S.toCharArray();
    int res = helperDP(data,len,memo);
    return res;    
    }
	

	public static void main(String[] args) {
	    String S = "1222";
	    int res = decodeVariations(S);
	    System.out.println(res);
	}
}

