public class MinStack {
	    
	    //Can be problematic with big stack as it takes a lot of space for each node. 
	    //Can use a second stack storing values of the substackMin instead to fix that issue. 
	    //All operations run in O(1). 
	    
	     class StackNode { 
	        int data; 
	        StackNode next; 
	        int substackMin; 		//Every node keeps track of min value beneath it, including its own value. 
	        
	        public StackNode(int data) { 
	            this.data = data; 
	        }
	    }
	    

	    StackNode top; 	//Top node of our stack. 
	    
	    /** initialize your data structure here. */
	    public MinStack() {
	        
	    }
	    
	    public void push(int x) {
	        
	        StackNode temp = new StackNode(x);
	        
	        temp.next = top;
	        
	        if(top == null) { 			//If there is nothing in the stack, the minimum value will be the value of the first node added. 
	            temp.substackMin = temp.data; 
	        }
	        
	        else {
	            if(temp.data > top.substackMin) { 		//If value of added node > min value of current stack.
	                temp.substackMin = top.substackMin; 		//Set min value of added node to min value of current stack. 
	            }
	            else { 
	                temp.substackMin = temp.data; 		//Else set min value of added node to value of the node itself. 
	            }
	        }
	        
	        top = temp; 							//Update stack top with added node. 
	          
	    }
	    
	    public void pop() {
	       // if(top == null) { 
	       //     throw new EmptyStackException(); 
	       // }
	        if(top != null) {
	            int item = top.data; 
	            top = top.next; 
	           // return item; 
	        }
	        
	    }
	    
	    public int top() {
	        if(top == null) { 
	            return Integer.MAX_VALUE;   //Error value to return. 
	        }
	        
	        return top.data; 
	        
	    }
	    
	    public int getMin() {
	        return top.substackMin; 
	    }
	

	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */

}
