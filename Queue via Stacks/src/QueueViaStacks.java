import java.util.Stack;

public class QueueViaStacks {
	
	    
	    Stack<Integer> stack = new Stack<>(); 
	    Stack<Integer> temp = new Stack<>(); 
	    int count = 0;
	        
	    /** Initialize your data structure here. */
	    public QueueViaStacks() {
	        
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        
	        stack.push(x); 
	        count++; 
	        
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        
	        int front = 0;
	        
	        if(count == 1) { 
	            front = stack.pop(); 
	            count = 0;
	            return front; 
	        }
	        else { 
	            while(count > 1 && stack.empty() == false) { 
	                temp.push(stack.pop());
	                count--;
	            }
	        
	            front = stack.pop(); 
	            count = 0;
	        
	            while(temp.empty() == false) { 
	                int data = temp.pop(); 
	                stack.push(data);
	                count++; 
	            }
	        }
	        
	        return front; 
	        
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	        
	        int front = 0;
	        
	        if(count == 1) { 
	            front = stack.peek(); 
	            count = 1;
	            return front; 
	        }
	        else { 
	            while(count > 1 && stack.empty() == false) { 
	                temp.push(stack.pop());
	                count--;
	            }
	        
	            front = stack.peek(); 
	            count = 1;
	        
	            while(temp.empty() == false) { 
	                int data = temp.pop(); 
	                stack.push(data);
	                count++; 
	            }
	        }
	        
	        return front; 
	        
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        
	        if(count == 0) { 
	            return true;
	        }
	        
	        return false; 
	        
	    }

}
