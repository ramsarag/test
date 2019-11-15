import java.io.*; 
import java.util.*;
import java.util.stream.Collectors;
class MinWordDis { 


static int findMinimumWordDistance(String words[], String wordA, String wordB) {
  int wordAIndex = -1;
  int wordBIndex = -1;
  int minDinstance = -1;
  int length = words.length;
  for (int i = 0; i < length; i++ ) {
    if (words[i] == wordA) {
      wordAIndex = i;
    }
    
    if (words[i] == wordB) {
      wordBIndex = i;
    }

    if ( wordAIndex != -1 && wordBIndex != -1 ) {
      int distance = Math.abs(wordAIndex - wordBIndex);
      if(minDinstance == -1 || minDinstance > distance) {
        minDinstance = distance;
      } 
    }
  }
  return minDinstance;
}
    // Driver Code 
    public static void main (String[] args) 
    { 
	    String arr[] = {"a", "b", "c", "e", "d","a","f","g","h","c"}; 
		String A = "a" ,  B="c";    
	    int res2 = findMinimumWordDistance(arr,A,B);	
	    System.out.println (res2); 
	    
	    String str = "AAABBBBCC";       //input String
    int length = str.length();      //length of a String

    //Created an object of a StringBuilder class        
    StringBuilder sb = new StringBuilder(); 

    int count=1;   //counter for counting number of occurances

    for(int i=0; i<length; i++){
        //if i reaches at the end then append all and break the loop
        if(i==length-1){         
            sb.append(str.charAt(i)+""+count);
            break;
        }

        //if two successive chars are equal then increase the counter
        if(str.charAt(i)==str.charAt(i+1)){   
            count++;
        }
        else{
        //else append character with its count                            
            sb.append(str.charAt(i)+""+count);
            count=1;     //reseting the counter to 1
        }
   }

    //String representation of a StringBuilder object
    System.out.println(sb.toString()); 
    } 
}
