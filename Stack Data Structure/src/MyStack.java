import java.util.EmptyStackException;

public class MyStack<T> {
	
	//We need stack nodes & keep track of top. 
	//We need pop(), peek(), push(), isEmpty(). 
	
	static class MyStackNode<T> { 
		T data; 
		MyStackNode<T> next; 
		
		public MyStackNode(T data) { 
			this.data = data; 
		}
	}
	
	MyStackNode<T> top; 
	
	public T pop() { 
		
		if(isEmpty() == true) { 
			throw new EmptyStackException(); 
		}
		
		T item = top.data; 
		top = top.next; 
		return item;  
		
	}
	
	public T peek() { 
		
		if(isEmpty() == true) { 
			throw new EmptyStackException(); 
		}
		
		T item = top.data; 
		return item; 
		
	}
	
	public void push(T data) { 
		
		MyStackNode<T> newNode = new MyStackNode(data);
		
		newNode.next = top; 
		top = newNode; 
		
	}
	
	public boolean isEmpty() {
		
		if(top == null) {
			return true;
		}
		return false; 
		
	}
	

}
