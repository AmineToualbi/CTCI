import java.util.ArrayList;

public class FasterArraySolution {
	
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	 ArrayList<Integer> arr = new ArrayList<>();
	 Integer lastPrinted = null; 
	
	 public boolean isValidBST(TreeNode root) { 
		    
	       if(root == null) { 
	            return true; 
	       }
	        
	        if(isValidBST(root.left) == false) { 
	            return false; 
	        }
	        
	        if(lastPrinted != null && lastPrinted >= root.val) {
	            return false; 
	        }
	        
	        lastPrinted = root.val; 
	        
	        if(isValidBST(root.right) == false) { 
	            return false;
	        }
	        
	        return true; 
	    
	    }

}
