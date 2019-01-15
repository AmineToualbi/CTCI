
// Definition for singly-linked list.
  
 
public class Add2Numbers {
	
	 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
    
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        boolean carry = false; 
        boolean l1Over = false; 
        boolean l2Over = false;
        int total = 0;
        ListNode sol = new ListNode(5);
        ListNode current = sol; 
        
        while(true) { 
            
            total = 0; 
        
            if(l1 != null) { 
                total += l1.val; 
                l1 = l1.next;
            }
            else { 
                l1Over = true;
            }
            
            if(l2 != null) { 
                total += l2.val;
                l2 = l2.next;
            }
            else { 
                l2Over = true; 
            }
            
            if(l1Over == true && l2Over == true) { 
                break;
            }
            
            if(carry == true) {
                total++;
                carry = false; 
            }
            
            if(total >= 10) { 
                carry = true; 
                total -= 10; 
            }
            
            
            
            current.next = new ListNode(total);
            current = current.next; 
     
            
        }
        
        if(carry == true) { 
            current.next = new ListNode(1);
        }
        
        return sol.next; 
        
    }
}