
// Program to find n-th stair 
// using step size 1 or 2 or 3. 
import java.util.*; 
import java.lang.*; 
  
public class ChildfindStep{ 
      
    // Returns count of ways to reach 
    // n-th stair using 1 or 2 or 3 steps. 
    public static int findStep(int n) 
    { 
        if (n == 1 || n == 0)  
            return 1; 
        else if (n == 2)  
            return 2; 
       
        else
            return findStep(n - 3) +  
                   findStep(n - 2) + 
                   findStep(n - 1);     
    } 
     public static int countWays(int n) 
    { 
        if(n == 0 || n==1){
            return 1;
        } else if(n==2){
            return 2;
        } else {
            int[] res = new int[n + 1];
            res[0] = 1;
            res[1] = 1;
            res[2] = 2;
            for(int i =3; i <= n; i++){
                res[i] += res[i-1]+res[i-2]+ res[i-3];
            }
            return res[n];
        }

    }  
    // Driver function 
    public static void main(String argc[]){ 
        int n = 3; 
        System.out.println(findStep(n)); 
        System.out.println(countWays(n)); 
    } 
}
