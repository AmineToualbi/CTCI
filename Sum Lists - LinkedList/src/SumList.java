
public class SumList {
	
	static class Node {
		Node next; 
		int data; 
		
		public Node(int d) {
			data = d;
		}
	}
	
	
	public static int separateDigits(Node head) {
		
		Node current = head; 
		int factor = 1; 
		int total = 0;
		
		while(current != null) {
			
			total += current.data * factor;
			
			current = current.next;
			factor = factor * 10;
		}
		
		System.out.println(total);
		return total;
		
	}
	
	public static Node addLists(Node head1, Node head2) {
		
		if(head1 == null && head2 == null) {
			return null;
		}
		
		int first = separateDigits(head1);
		int second = separateDigits(head2);
		
		int total = first + second; 
		
		System.out.println(total);
		
		int factor = 10;
		
		Node result = new Node(total % factor); 
		Node current = result;
		
		while(total / factor > 1) {
			total = total / factor;
			current.next = new Node(total % factor);
			current = current.next;

		}
		
		//printNodes(result);
		
		return result;
		
		
		
	}
	
	public static void printNodes(Node head) {
		System.out.println("PRINT");
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next; 
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(7);
		head.next = new Node(5);
		head.next.next = new Node(9);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(6);

		
		Node head2 = new Node(8);
		head2.next = new Node(4);
//		head2.next.next = new Node(0);
//		head2.next.next.next = new Node(5);
//		head2.next.next.next = new Node(6);

		
		
		printNodes(addLists(head, head2));
		
		

	}

}
