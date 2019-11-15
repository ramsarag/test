
class Node {
    int data;
    Node left;
    Node right;
}

class BST {
    
    public Node createNode(int x){
        Node n = new Node();
        n.data = x;
        n.left = null;
        n.right = null;
        return n;
    }
    public Node insertNode(Node node , int x){
        if(node == null){
          return  createNode(x);
        } 
        if( x < node.data) {
            node.left = insertNode(node.left , x);
        } else { 
            node.right = insertNode(node.right , x);
        } 
        return node;
    }
    public void  inorder(Node root)
    {
      if(root == null)
        return;
      inorder(root.left);
      System.out.println(root.data);
      inorder(root.right);
    }
    public void showNode(Node node){
       System.out.println(node.data);
       
    }
}

class BSTapp {
    public static void main(String args[]){
        BST t = new BST();
        Node root = null;
        System.out.println("8,3,6,10,4,7,1,13,14");
        root = t.insertNode(root , 8);
        root = t.insertNode(root , 3);
        root = t.insertNode(root , 6);
        root = t.insertNode(root , 10);
        root = t.insertNode(root , 4);
        t.inorder(root);
    }
}
