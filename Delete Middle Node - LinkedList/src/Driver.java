
public class Driver {
	
	public static boolean removeMiddle(LinkedListNode node) {
		
		if (node == null && node.next == null) {
			return false;
		}
		
		node.data = node.next.data;
		node.next = node.next.next;
		
		
		
		return true;
		
	}
	
	public static void printNodes(LinkedListNode head) {
		
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(4);
		head.next.next.next.next = new LinkedListNode(5);
		head.next.next.next.next.next = new LinkedListNode(6);
		head.next.next.next.next.next.next = new LinkedListNode(7);
		head.next.next.next.next.next.next.next = new LinkedListNode(8);
		
		removeMiddle(head.next.next);
		printNodes(head);
		

	}

}
