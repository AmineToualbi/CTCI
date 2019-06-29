
public class CycleInList {
	
	//https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem

	static boolean hasCycle(SinglyLinkedListNode head) {
        if(head == null) return false; 

        SinglyLinkedListNode current = head; 
        HashMap<SinglyLinkedListNode, Boolean> visitedNodes = new HashMap<>(); 
        while(current.next != null) { 
            if(visitedNodes.containsKey(current)) {
                return true; 
            }
            visitedNodes.put(current, true); 
            current = current.next; 
        }

        return false; 
    }

}
