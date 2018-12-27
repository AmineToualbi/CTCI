import java.util.Stack;

public class FasterQueueViaStacks {
    
    Stack<Integer> oldest = new Stack<>(); 
    Stack<Integer> newest = new Stack<>(); 
        
    /** Initialize your data structure here. */
    public FasterQueueViaStacks() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        
        newest.push(x);
        
    }
    
    public void shiftStacks() { 
    
        if(oldest.empty() == true) { 
            while(newest.empty() == false) { 
                oldest.push(newest.pop());
            }
        }
    
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        shiftStacks(); 
        return oldest.pop(); 
        
    }
    
    /** Get the front element. */
    public int peek() {
        
        shiftStacks(); 
        return oldest.peek(); 
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        
        if(oldest.size() + newest.size() == 0) { 
            return true;
        }
        
        return false; 
        
    }
}
