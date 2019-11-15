import java.io.*;
import java.util.*;

class PairArrSolution {

  static int[][] findPairsWithGivenDifference(int[] arr, int k) {
    // your code goes here
    HashMap<Integer,Integer> map = new HashMap<>();
    List<List<Integer>> list = new ArrayList<>();
    //List<int[]> rows = new ArrayList<>();
    for(int i : arr){
        map.put(i,1);
    }
    int[][] myNum = {};
    int len = arr.length;
    for(int i=0;i< len;i++){
      int diff = arr[i] - k;
      if(map.get(diff) != null){
        //String s = "{"+ arr[i] + ","+ diff + "}";
        list.add(new ArrayList<Integer>());
        list.get(list.size()-1).add(arr[i]);
        list.get(list.size()-1).add(diff);
        //rows.add(new int[]{arr[i],diff});
        //.add(list.size()).add(diff);
      }
      //map.put(arr[i],i);
    }
    //rows.forEach( item->System.out.println(Arrays.toString(item)) );
    System.out.println(Arrays.toString(list.toArray()));
    return myNum;
  }
  static int getPairsCount(int[] arr, int k) {
    int res = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    List<List<Integer>> list = new ArrayList<>();
    int len = arr.length;
    int j=0;
    for(int i : arr){
        map.put(j,i);
        j++;
    }
    int m = 0;
    for(int i =0;i<len;i++){
        int diff = k - arr[i];
        if(map.get(diff) !=null){
            System.out.println("{"+arr[i] +"," +diff + "}");
            res++;
            list.add(new ArrayList<Integer>());
            list.get(m).add(arr[i]);
            list.get(m).add(diff);
            m++;            
        }
     }   
    System.out.println(list);System.out.println(Arrays.toString(list.toArray()));
     return res;
  }
  public static void main(String[] args) {
       //  [1,5,11,7], 4  {1=0, 5=1, 7=3, 11=2} Expected: [[5,1],[11,7]
        // [0,-1,-2,2,1], 1,Expected: [[1,0],[0,-1],[-1,-2],[2,1]]
       //int[] arr = new int[]{1,5,11,7}; 
       int[] arr = new int[]{0,-1,-2,2,1};
       int k = 1;
       int[][] res;      
       res = findPairsWithGivenDifference(arr,k);
       System.out.println(Arrays.toString(res));
       System.out.println(getPairsCount(arr,k));
  }

}

