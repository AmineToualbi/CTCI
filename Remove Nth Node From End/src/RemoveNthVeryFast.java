
public class RemoveNthVeryFast {
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        int lengthOfList = getLengthOfList(head); 
	        int currentIndex = 0;
	        int indexToRemove = lengthOfList - n;
	        
	        if(indexToRemove == 0) return  head.next;
	        
	        ListNode realHead = head; 
	        
	        while(head != null) {
	            if(currentIndex+1 == indexToRemove) {
	                head.next = head.next.next; 
	            }
	            currentIndex++; 
	            head = head.next; 
	        }
	        
	        
	        return realHead; 
	        
	    }
	    
	    public int getLengthOfList(ListNode head) {
	        int length = 0;
	        while(head != null) {
	            head = head.next; 
	            length++;
	        }
	        return length; 
	    }

}
