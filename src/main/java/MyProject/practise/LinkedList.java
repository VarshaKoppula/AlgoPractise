package MyProject.practise;

public class LinkedList {
	 Node head=null;
	 Node current=null;

	public Node deleteDuplicates(Node node) {
	head=node;	
	 if(node==null) {
		 return head;
	 }
	 while(node.next!=null) {
		if(node.data ==node.next.data) {
			node.next=node.next.next;
		}
		else {
			node=node.next;
		}
		
	 }				 				 
	 return head;	 
	}
	public  void addNode(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}
		else {
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=node;
	}		
	}
	
	public  void insertNode(int index,int data) {
		Node node=new Node(data);
		Node current=head;
		if(index==0) {
			node.next=head;
			head=node;
		}
		else {
		for(int i=0;i<index-1;i++) {
		current=current.next;
		}
		node.next=current.next;
		current.next=node;		
		}	
	}

	public  void deleteNode(int index) {
	Node current=head;	
	if(index==0) {
		head=head.next;
	}
	else {
		for(int i=0;i<index-1;i++) {
		current=current.next;	
		}
		current.next=current.next.next;		
	}
	}
	
	public Node sumofList(Node l1,Node l2) {
		int sum=0;
		int carry=0;
		Node dummyHead=new Node(0);
		Node current=dummyHead;
		while(l1!=null||l2!=null||carry!=0) {
			int x=(l1!=null?l1.data:0);
			int y=(l2!=null?l2.data:0);
			sum=sum+x+y;
		current.next= new Node(sum%10);
		current=current.next;
		carry=sum/10;
		if(l1!=null) {
			l1=l1.next;
		}
		if(l2!=null) {
			l2=l2.next;
		}
		}
		return dummyHead.next;
	}

    
	public  void display() {
		Node current=head;
		if(head==null) {
			 System.out.print("list is empty");	
		}
		 while(current.next != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }
		 System.out.println(current.data);
	}
	
	public void checkPalindrome(Node head) {	
	if(head==null){
		
	}
		
	}
	
}