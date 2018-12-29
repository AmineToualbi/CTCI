
public class Graph {
	
	int maxVertices = 6; 
	Node[] vertices; 
	int count; 
	
	public Graph() { 
		
		vertices = new Node[maxVertices];
		count = 0;
		
	}
	
	public void addNode(Node x) { 
		
		if(count < maxVertices) { 
			vertices[count] = x;
			count++;
		}
		else { 
			System.out.println("Graph is full.");
		}
		
	}
	
	public Node[] getNodes() { 
		return vertices; 
	}

}
