import java.util.*;

class TestLinkList {

class Node {
    Node head;
    Node next;
    int data;
}
    public void add(int x){
        //Node n = new Node(x);
        //n.head = 
        //n.next
    }
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
        al.add(null);
        al.add(4);
        al.add(4);
        al.add(3);
        al.add(5);
        al.add(null);
        
         ll.add(null);
        ll.add(4);
        ll.add(4);
        ll.add(3);
        ll.add(5);
        ll.add(null);
        
        hs.add(null);
        hs.add(4);
        hs.add(4);
        hs.add(3);
        hs.add(5);
        hs.add(null);
        
        //ts.add(null);
        ts.add(4);
        ts.add(4);
        ts.add(3);
        ts.add(5);
        ts.add(-1);
        //ts.add(null);
        
        lhs.add(null);
        lhs.add(4);
        lhs.add(4);
        lhs.add(3);
        lhs.add(5);
        lhs.add(null);
        
        hm.put(5,5);
        hm.put(4,4);
        hm.put(1,2);
        hm.put(1,2);
        hm.put(2,2);
        hm.put(2,2);
        hm.put(null,null);
        hm.put(null,null);
        
        tm.put(5,-1);
        tm.put(4,4);
        tm.put(1,2);
        tm.put(1,2);
        tm.put(2,2);
        tm.put(2,2);
        //tm.put(null,null);
        //tm.put(null,null);
        
        
        lhm.put(5,-1);
        lhm.put(4,4);
        lhm.put(1,2);
        lhm.put(1,2);
        lhm.put(2,2);
        lhm.put(2,2);
        lhm.put(null,null);
        lhm.put(null,null);
        
        System.out.println("arraylist"+al);
        System.out.println("linkedlist"+ll);
        System.out.println("hashset"+hs);
        System.out.println("treeset"+ts);
        System.out.println("linkedhashset"+lhs);
        System.out.println("hashmap"+hm);
        System.out.println("treemap"+tm);
        System.out.println("linkedhashmap"+lhm);
        //System.out.println(Arrays.toString(al));
    }
}
