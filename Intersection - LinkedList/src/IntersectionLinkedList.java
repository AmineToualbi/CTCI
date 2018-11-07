//LeetCode.

public class IntersectionLinkedList {
	
	
	  //Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	        int lengthA = getLength(headA);
	        int lengthB = getLength(headB);
	        ListNode currentA = headA;
	        ListNode currentB = headB;
	        
	        //If one of the linkedlist is empty, there can't be an intersection. 
	        if(lengthA == 0 || lengthB == 0){
	            return null;
	        }
	        
	        //We calculate k = the difference between the lengths of the two lists. 
	        //e.g.: 3 -> 6 -> 11 -> 10 -> 8 -> 9 -> 1 
	        //      12 -> 10 -> 8 -> 9 -> 1
	        //We see that after intersection point, all nodes are the same. So we have k values that are possibly the same. 
	        //We move start node of biggest linked list by this value k to compare 2 lists of same length.
	        int k = 0;
	        if(lengthB < lengthA) { 
	            k = lengthA - lengthB;
	            while( k != 0){
	                currentA = currentA.next; 
	                k--;
	            }
	        }
	        else if(lengthA < lengthB) { 
	            k = lengthB - lengthA; 
	            while( k != 0){
	                currentB = currentB.next; 
	                k--;
	            }
	        }
	        
	        //CurrentA & CurrentB will take values and no matter what, they will be equal at some point. Whether @ intersection pt. or null node. 
	        //We return that node, whether it contains the value or the null node. 
	        while(currentA != currentB) {
	            currentA = currentA.next;
	            currentB = currentB.next;
	        }
	        
	        return currentA;
	        
	    }
	    
	    public int getLength(ListNode head) { 
	        int count = 0;
	        while(head!=null){
	            count++;
	            head = head.next;
	        }
	        return count;
	    }

}
