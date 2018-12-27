import java.util.NoSuchElementException;

public class MyQueue<T> {
	
	//Operations: add(item), remove(), peek(), isEmpty(). 
	
	static class MyQueueNode<T> { 
		
		
		T data; 
		MyQueueNode<T> next; 
		
		public MyQueueNode(T data) {
			this.data = data; 
		}
		
	}
	
	MyQueueNode<T> first; 
	MyQueueNode<T> last; 
	
	public void add(T item) { 
		
		MyQueueNode<T> newNode = new MyQueueNode(item);
		
		if(last != null) { 
			last.next = newNode; 
		}
		
		last = newNode; 
		
		if(first == null) { 
			first = last; 
		}
		
	}
	
	public T remove() { 
		
		if(first == null) { 
			throw new NoSuchElementException(); 
		}
		
		T item = first.data; 
		
		first = first.next; 
		
		if(first == null) { 
			last = null; 
		}
		
		return item; 
		
	}
	
	public T peek() { 
		
		if(first == null) { 
			throw new NoSuchElementException(); 
		}
		
		return first.data; 
		
	}
	
	public boolean isEmpty() { 
		
		if(first == null) { 
			return true;
		}
		
		return false; 
		
	}
	
	

}
