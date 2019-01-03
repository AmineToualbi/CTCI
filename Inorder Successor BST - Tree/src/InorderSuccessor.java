import java.util.ArrayList;

public class InorderSuccessor {
	
	class TreeNode { 
		int data; 
		TreeNode left, right; 
		
		public TreeNode(int data) { 
			this.data = data; 
			left = null;
			right = null; 
		}
	}
	
	ArrayList<TreeNode> arr = new ArrayList<>();
	
	public TreeNode inorderSuccessor(TreeNode root, TreeNode k)			//Runs in O(n). 
         {
          inorderToArray(root); 			//Runs in O(n). 
          for(int i=0; i<arr.size(); i++) { 			//Runs in O(n). 
              if(arr.get(i).data == k.data && i != arr.size() -1) { 
                  return arr.get(i+1);
              }
          }
          
          return null;
         }
    
	
	/*Tree traversal is a type of breadth-first traversal. 
	 * BFS occurs in O(n + m): n = number of nodes, m = number of edges. 
	 * In Binary Tree, no. of edges max = 2. 
	 * Any tree has a max no. of edges = n - 1 to avoid cyclic graph. 
	 * Time complexity = O(n + m) = O(n + n - 1) = O(n). 
	 * ALL TREE TRAVERSALS TAKE O(N). 
	 */
    public void inorderToArray(TreeNode root) { 
     
        if(root != null) { 
            inorderToArray(root.left);
            arr.add(root); 
            inorderToArray(root.right);
        }
        
    }

}
