import java.util.Stack;

public class PalindromeIntGeeks4Geeks {
	
	static class Node {
		Node next; 
		int data; 
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	boolean isPalindrome(Node head) 
    {
        Stack <Integer> stack = new Stack<Integer>(); 
        Node current = head; 
        Node resultHead = new Node(0);
        Node result = resultHead; 
        
        while(current != null){
            stack.push(current.data);
            current = current.next; 
        }
        
        int count = 0;
        while(stack.empty() != true){
            int data = stack.pop(); 
            result.data = data; 
            if(result.next == null){
                result.next = new Node(0);
            }
            result = result.next;
        }
        
        current = head; 
        while(current != null){
            if(current.data != resultHead.data) {
                return false;
            }
            current = current.next;
            resultHead = resultHead.next; 
        }
        
        return true;
        
    }

}
