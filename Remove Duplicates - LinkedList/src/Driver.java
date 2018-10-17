
public class Driver  {
	
	
	public static void removeDups(LinkedListNode node) {
		
		LinkedListNode current = node;
		LinkedListNode runner = node;
		int count = 0;
		
		while(current != null) {
//			System.out.println(count);
			runner = current; 
			
			while(runner.next != null) {
				//System.out.print(runner.data + " ");
				if(runner.next.data == current.data ) {
					if(runner.next.next != null) {
						runner.next = runner.next.next;
					}
					else {
						runner.next = null;
					}
				}
				else {
					runner = runner.next;
				}
				
			}
			
			current = current.next; 
			count++;

			
		}
		
		printList(node);
		
	}
	
	public static void printList(LinkedListNode node) {
	
		  while (node != null) { 
	            System.out.print(node.data + " "); 
	            node = node.next; 
	        } 		
		
	}

	public static void main(String[] args) {
		
//		LinkedListNode head = new LinkedListNode(10);
//		head.next = new LinkedListNode(10);
//		head.next.next = new LinkedListNode(10);
//		head.next.next.next = new LinkedListNode(10);
//		head.next.next.next.next = new LinkedListNode(10);
//		head.next.next.next.next.next = new LinkedListNode(1);
//		head.next.next.next.next.next.next = new LinkedListNode(11);
//		head.next.next.next.next.next.next.next = new LinkedListNode(11);
		
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		
		printList(head);
		System.out.println();
		removeDups(head);

	}

}
