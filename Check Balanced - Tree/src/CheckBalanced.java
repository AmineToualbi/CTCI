
public class CheckBalanced {
	
	
	 // Definition for a binary tree node.
	   class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	    
	    public int getHeight(TreeNode root) { 
	        
	        if(root == null) return -1; 			//-1 bc we don't count the root in the height count. We can use 0 if we want to count it. 
	        
	        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	                
	    }
	    
	    public boolean isBalanced(TreeNode root) {
	        
	        if (root == null) return true; 
	        
	        int heigtDiff = getHeight(root.left) - getHeight(root.right); 
	        if(Math.abs(heigtDiff) > 1) { 
	            return false; 
	        }
	        else { 
	        		//We run first on root of tree to check whether the nodes under have balanced subtrees. 
	        		//Then, we run on the nodes under the root to check if they have balanced subtrees down too etc... 
	            return isBalanced(root.left) && isBalanced(root.right);
	        }
	        
	    }
	    

}
