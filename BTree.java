
class Node {
    int data;
    Node(int data){
        this.data = data;
    }
    Node left;
    Node right;
}

class BTree {
    
    public static Node Search(Node root, int key){
         if(root == null){
            return null;
        }
        if(root.data == key) return root; 
        else if(root.data < key ){
            return Search(root.left,key);
        }  else {
            return Search(root.right,key);
        }
        
    }
    
    public static Node Insert(Node root, int data){
         if(root == null){
            root = new Node(data);
        } else if(data <= root.data){
            root.left = Insert(root.left,data);
        }  else if(data >= root.data){
            root.right = Insert(root.right,data);
        }
        return root;
    }
    public static void  Inorder(Node root)
    {
      if(root == null)
        return;
      Inorder(root.left);
      System.out.println(root.data);
      Inorder(root.right);
    }

    public static void  Preorder(Node root)
    {
      if(root == null)
        return;
      System.out.println(root.data);  
      Preorder(root.left);      
      Preorder(root.right);
    }
    
    public static void  Postorder(Node root)
    {
      if(root == null)
        return;
      Postorder(root.left);      
      Postorder(root.right);
      System.out.println(root.data);
    }
    
    public static void main(String args[]){
        
        Node root = null;
        Node snode = new Node(0);
        root = Insert(root, 15);
        root = Insert(root, 10);
        root = Insert(root, 20);
        root = Insert(root, 8);
        root = Insert(root, 12);
        root = Insert(root, 17);
        root = Insert(root, 25);
        snode = Search(root,8);
        //System.out.println("search result:" + snode.data);
        //System.out.println("left result:" + snode.left.data);
        //System.out.println("rght result:" + snode.right.data);
        
        System.out.println("Inorder:");
        Inorder(root);
        System.out.println("Preorder:");
        Preorder(root);
        System.out.println("Postorder:");
        Postorder(root);
       
    }
}
