
public class Driver {
	
	class Node { 
		int data; 
		Node next; 
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	 int getNthFromLast(Node head, int n)
	    {
	        Node current = head;
	        int length = 0;
	        Node node = head; 
	        
	        while(current.next != null){
	            
	            current = current.next; 
	            length++; 
	            
	        }
	        
	        Node last = current;
	        int countUp = length - n; 
	        
	        if(countUp < -1){
	            return -1;
	        }
	        
	        while(countUp > -1){
	            node = node.next; 
	            countUp--; 
	        }
		    
		    return node.data;
		    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
