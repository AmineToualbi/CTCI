
public class CheckSubtree {
	
	
	  class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
	 
	    public boolean isSubtree(TreeNode s, TreeNode t) {
	        
	        StringBuilder stringS = new StringBuilder();
	        treeToStringPreorder(s, stringS);
	        StringBuilder stringT = new StringBuilder();
	        treeToStringPreorder(t, stringT); 
	        

	        return stringS.toString().contains(stringT.toString());
	        
	    }
	    
	    
	    
	    public void treeToStringPreorder(TreeNode n, StringBuilder sb) { 
	    
	        if(n == null) { 
	            sb.append("-X");
	            return;
	        }
	        
	        sb.append("-" + n.val);    
	        //We use - as a separator in the case of having a tree with one node 12 & a tree with one node 2. 
	        //We will have s1 = "12" & s2 = "2". s1.contains(s2) will return true bc of "2" which is wrong. 
	        treeToStringPreorder(n.left, sb);
	        treeToStringPreorder(n.right, sb);
	 

	    }
	    
}
	        
	      

	
