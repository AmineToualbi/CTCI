
public class LinkedListNode {
	
	int data; 
	LinkedListNode next, prev, last;
		
	public LinkedListNode(int d) { 
		data = d;
	}
	
	public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
		data = d;
		setNext(n);
		setPrevious(p);
	}
	
	public LinkedListNode() { }
	
	
	public void setNext(LinkedListNode n) {
		
		LinkedListNode current = this; 
		next = n;
		
		if(current == last) {
			last = n;
		}
		
		if(n != null && n.prev != current) {
			n.setPrevious(current);
		}
		
	}
	
	public void setPrevious(LinkedListNode p) {
		
		LinkedListNode current = this; 
		prev = p;
				
		if(p != null & p.next != current) {
			p.setNext(current);
		}
		
	}
	

}
	
