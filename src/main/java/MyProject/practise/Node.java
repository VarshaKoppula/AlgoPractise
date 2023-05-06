package MyProject.practise;


public class Node {
	
		Node next;
		int data;
		Node(){
			
		}
		Node(int data){
			this.data=data;
			}
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
}
