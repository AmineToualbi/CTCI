public class Partition {

	 static class LinkedListNode {
		int data;
		LinkedListNode next;
		
		public LinkedListNode(int d) {
			data = d; 
		}
		
	}

	 public static LinkedListNode  partition(LinkedListNode node, int x) {
		 LinkedListNode beforeStart = null;
			LinkedListNode beforeEnd = null;
			LinkedListNode afterStart = null;
			LinkedListNode afterEnd = null;
			
			/* Partition list */
			while (node != null) {
				
				LinkedListNode next = node.next;
				node.next = null;
				System.out.println(node.data);
				
				if (node.data < x) {
					if (beforeStart == null) {
						beforeStart = node;
						beforeEnd = beforeStart;
					} else {
						beforeEnd.next = node;
						beforeEnd = node;
					}
				} else {
					if (afterStart == null) {
						afterStart = node;
						afterEnd = afterStart;
					} else {
						afterEnd.next = node;
						afterEnd = node;
					}
				}
				
				//node = node.next;
				node = next; 
				
			}
			
			/* Merge before list and after list */
			if (beforeStart == null) {
				return afterStart;
			}
			
			beforeEnd.next = afterStart;
			return beforeEnd;
		 
	 }
	
	
public static void printNodes(LinkedListNode head) {
		
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode head = new LinkedListNode(3);
		head.next = new LinkedListNode(9);
		head.next.next = new LinkedListNode(8);
		head.next.next.next = new LinkedListNode(5);
		head.next.next.next.next = new LinkedListNode(10);
		head.next.next.next.next.next = new LinkedListNode(2);
		head.next.next.next.next.next.next = new LinkedListNode(1);
		
		LinkedListNode result = partition(head,3);
		
		printNodes(result);
		
		//test(head);
		

	}

}
