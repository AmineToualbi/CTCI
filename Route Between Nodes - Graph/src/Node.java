
public class Node {
	
	String vertex; 
	Node adjacent[]; 
	int adjacentCount;
	boolean visited; 
	
	public Node(String vertexName, int adjacentNbr) { 
		
		vertex = vertexName; 
		adjacentCount = 0;
		adjacent = new Node[adjacentNbr];
		visited = false; 
		
	}
	
	public void addAdjacent(Node x) { 
		
		if(adjacentCount < adjacent.length) { 
			adjacent[adjacentCount] = x; 
			adjacentCount++; 
		}
		else { 
			System.out.println("Adjacency list is full.");
		}
		
	}
	
	public Node[] getAdjacent() { 
		return adjacent; 
	}
	
	public String getVertex() { 
		return vertex; 
	}
	
	

}
