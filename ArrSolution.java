import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ArrSolution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int len = s.size();
        int counts = 0;
        if(len == 1 && m == 1 && d == s.get(0)){
            counts +=1;
        } else {
            for(int i =0; i< len; i++){
                if(i+m <= len){
                    List<Integer> news = s.subList(i, i+m); 
                    System.out.print(news);
                    int sum = news.stream().mapToInt(Integer::intValue).sum();
                    System.out.print(sum);
                    if(d == sum ){
                        counts +=1;
                    }
                }
            
            }
        }
        //System.out.print(counts);
        return counts;
    }
    public static void main(String[] args){
        int d = 18;
        int m = 7;
        Integer[] vowels = new Integer[]{2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
        //Integer[] vowels = Integer[]{2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
		List<Integer> s = Arrays.asList(vowels);
		System.out.println(s);
		
      
        int result = birthday(s, d, m);
        System.out.print(result);
    }
    
} 
