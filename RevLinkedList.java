// Java program for reversing the Linked list 

class RevLinkedList { 

	static Node head; 
    static Node1 head1;
	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
    static class Node1 {
        Node1 next;
        int data;
        Node1(int d){
            data = d;
            next = null;
        }
    }
	// A simple and tail recursive function to reverse 
	// a linked list. prev is passed as NULL initially. 
	Node reverseUtil(Node curr, Node prev) 
	{ 

		/* If last node mark it head*/
		if (curr.next == null) { 
			head = curr; 

			/* Update next to prev node */
			curr.next = prev; 

			return head; 
		} 

		/* Save curr->next node for recursive call */
		Node next1 = curr.next; 

		/* and update next ..*/
		curr.next = prev; 

		reverseUtil(next1, curr); 
		return head; 
	} 

	// prints content of double linked list 
	void printList(Node node) 
	{ 
		while (node != null) { 
			System.out.print(node.data + ", "); 
			node = node.next; 
		} 
	} 

    // prints content of double linked list 
	void printList1(Node1 node) 
	{ 
		while (node != null) { 
			System.out.print(node.data + ", "); 
			node = node.next; 
		} 
	} 
        
    Node1 reverse(Node1 node) {
        Node1 current = node;
        Node1 prev = null;
        Node1 next = null;
        while(current != null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next; 
        }
        
        node = prev;
        return node;
    }
	public static void main(String[] args) 
	{ 
		RevLinkedList list = new RevLinkedList(); 
		list.head = new Node(1); 
		list.head.next = new Node(2); 
		list.head.next.next = new Node(3); 
		list.head.next.next.next = new Node(4); 
		list.head.next.next.next.next = new Node(5); 
		list.head.next.next.next.next.next = new Node(6); 
		list.head.next.next.next.next.next.next = new Node(7); 
		list.head.next.next.next.next.next.next.next = new Node(8); 

		System.out.println("Original Linked list "); 
		list.printList(head); 
		Node res = list.reverseUtil(head, null); 
		System.out.println(""); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		list.printList(res); 
		
		RevLinkedList list1 = new RevLinkedList(); 
        list1.head1 = new Node1(85); 
        list1.head1.next = new Node1(15); 
        list1.head1.next.next = new Node1(4); 
        list1.head1.next.next.next = new Node1(20); 
		System.out.println("Given Linked list"); 
        list1.printList1(head1); 
        head1 = list1.reverse(head1); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list1.printList1(head1);
	} 
} 

// This code has been contributed by Mayank Jaiswal 

