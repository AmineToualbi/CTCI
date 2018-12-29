import java.util.NoSuchElementException;

public class MyQueue<T> {
	
	//Operations: add(item), remove(), peek(), isEmpty(). 

	class QueueNode<T> {
		
		T data; 
		QueueNode next; 
		
		public QueueNode(T data) { 
			this.data = data; 
		}
		
	}
	
	QueueNode<T> first;
	QueueNode<T> last; 
	
	public void add(T item) { 
		
		QueueNode newNode = new QueueNode(item);
		
		if(last != null) { 
			last.next = newNode; 
		}
		
		last = newNode; 
		
		if(first == null) { 
			first = newNode; 
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
