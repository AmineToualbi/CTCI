import java.util.Stack;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    SinglyLinkedListNode(int data) { 
   	 	data = this.data; 
    }
}

public class Reverse {
	
	 
	     
	
	public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        SinglyLinkedListNode current = head; 
        Stack<Integer> stack = new Stack<>(); 
        SinglyLinkedListNode solution = new SinglyLinkedListNode(10);
        SinglyLinkedListNode runner = new SinglyLinkedListNode(10); 
        boolean first = true; 

        while(current != null) { 
            stack.push(current.data); 
            current = current.next; 
        }

        while(stack.empty() == false) { 
            int number = stack.pop();
            if(first == true) { 
                runner.data = number; 
                solution.next = runner; 
                first = false; 
            }
            else { 
                runner.next = new SinglyLinkedListNode(number); 
                runner = runner.next; 
            }
        }

        return solution.next; 

    }
	
}
