import java.util.ArrayList;

public class ArraySolution {
	
	   class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    
	   ArrayList<Integer> arr = new ArrayList<>();
	    
	    public boolean isValidBST(TreeNode root) {
	        
	        if(root == null) { 
	            return true; 
	        }
	        
	        inOrderToArray(root);
	       
	        int previousVal; 
	        previousVal = arr.get(0);
	        
	        for(int i=1; i<arr.size(); i++) { 
	            if(previousVal >= arr.get(i)) { 
	                return false; 
	            }
	            previousVal = arr.get(i); 
	            
	        }
	        
	        return true; 
	        
	    }
	    
	    public boolean inOrderToArray(TreeNode root) { 
	            
	        if(root != null) { 
	            inOrderToArray(root.left); 
	            arr.add(root.val); 
	            inOrderToArray(root.right); 
	        }
	        
	        return true; 
	    
	    }
	    
    
}