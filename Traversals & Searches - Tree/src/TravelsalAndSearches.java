import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//Operations happen in O(log n); 
//BFS & DFS run in O(v + e); 

public class TravelsalAndSearches {
	
	class Node {
		int data; 
		Node left, right;
		boolean visited; 	//For search purposes. 
		Node[] adjacent; 	//For search purposes, we use an adjacency list. 
		
		public Node(int data) { 
			this.data = data; 
			visited = false; 
		}
	}
	
	//Inorder = left, root, right. 
	public void inorder(Node node) { 
		
		if(node != null) { 
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right); 
		}
		
	}
	
	//Preorder = root, left, right. 
	public void preorder(Node node) { 
		
		if(node != null) { 
			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.right);
		}
		
	}
	
	//Postorder = left, right, root. 
	public void postorder(Node node) { 
		
		if(node != null) { 
			postorder(node.left); 
			postorder(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	//DFS = go down a branch first before moving to neighbor. 
	//Similar to tree traversal. 
	public void dfs(Node node) { 
		
		if(node != null) {
			
			System.out.print(node.data + " ");
			node.visited = true; 
			
			for(int i=0; i<node.adjacent.length; i++) {
				if(node.adjacent[i].visited == false) {
					System.out.println(node.data + " ");
				}
			}
			
		}
		
	}
	
	//BFS = visit all neighbors first. 
	public void bfs(Node node) { 
		
		MyQueue<Node> queue = new MyQueue<>(); 
		node.visited = true; 
		queue.add(node);
		
		while(queue.isEmpty() == false) { 
			Node r = queue.remove(); 
			System.out.print(r.data + " ");
			
			for(int i=0; i<r.adjacent.length; i++) { 
				Node neighbor = r.adjacent[i];
				if(neighbor.visited == false) { 
					neighbor.visited = true; 
					queue.add(neighbor);
				}
			}
			
			
		}
		
	}
	

}
