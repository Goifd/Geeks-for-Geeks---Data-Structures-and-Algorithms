// simplest Linked list implementation in Java
Class Node {
	int data;	
	Node next; // self referential structure
	Node(int value){
		this.value = value;
		this.next = next;
	}

    traverse(Node head){
        System.out.prinln(head.data);
        if(head.next!=null)
            return traverse(head.next);
        return;
    }
}
class Test{
	public static void main(String args[]){
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.next = temp2;
	}
}