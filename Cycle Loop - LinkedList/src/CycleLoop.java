import java.util.HashMap;

public class CycleLoop {
	
	 class Node { 
		int data; 
		Node next; 
		Node(int data) { 
			this.data = data; 
		}
	 }
	
	boolean hasCycle(Node head) {
	    
	    HashMap<Node, Integer> seen = new HashMap<>();
	    
	    while (head != null) {
	        
	        if(seen.get(head) != null && seen.get(head) >= 1) { 
	            return true;
	        }
	        else { 
	            seen.put(head, 1);
	        }
	        
	        head = head.next;

	    }
	    return false;
	}

}
