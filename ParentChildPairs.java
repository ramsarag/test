import java.util.*;

class ParentChildPairs {
    public static void main(String[] args) {
        int[][] pairs = new int[][] {
        {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
        {4, 5}, {4, 8}, {8, 9}};

   
    
        List<List<Integer>> returnList = findParents(pairs);
        int i = 0;
        // parent, child
        while(i < returnList.get(0).size()){
          System.out.println(returnList.get(0).get(i));
          i++;
        }
        
        System.out.println("---------- ");
        i = 0;
        while(i < returnList.get(1).size()){
          System.out.println(returnList.get(1).get(i));
          i++;
        }
        System.out.println(" -----------");
        i = 0;
        while(i < returnList.get(2).size()){
          System.out.println(returnList.get(2).get(i));
          i++;
        }
        
    }
    public static List<List<Integer>> findParents(int[][] pairs){
    HashMap<Integer, Integer> numberOfParents = new HashMap<>();
    
    for(int i = 0; i < pairs.length; i++){
      int child = pairs[i][1];
      int parent = pairs[i][0];
      
      if(numberOfParents.containsKey(child))
        numberOfParents.put(child, numberOfParents.get(child) + 1);
      else
        numberOfParents.put(child, 1);
      
      if(!numberOfParents.containsKey(parent))
        numberOfParents.put(parent, 0);
      
     }
    
        ArrayList<Integer> zeroParents = new ArrayList<>();
        ArrayList<Integer> oneParent = new ArrayList<>();
        ArrayList<Integer> twoParent = new ArrayList<>();
    
        numberOfParents.forEach((key, value) -> {
        if(value == 0)
          zeroParents.add(key);
        if(value == 1)
          oneParent.add(key); 
        if(value == 2)
            twoParent.add(key);  
         });
    
        List<List<Integer>> returnList = new ArrayList<>();
  
        returnList.add(zeroParents);
        returnList.add(oneParent);
        returnList.add(twoParent);
        return returnList;
    
  
    }    
}    
