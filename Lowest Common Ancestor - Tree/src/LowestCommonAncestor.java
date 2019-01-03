import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class LowestCommonAncestor {
	
	class TreeNode { 
		
		int data; 
		TreeNode left, right; 
		
		TreeNode(int data) { 
			this.data = data; 
		}
		
	}
	
	/* Step-by-step procedure: 
    1. Create HashMap<TreeNode, TreeNode> linking node to its parent. 
       Use a stack to evaluate each node. 
    2. Store ancestors of p in a data structure. 
    3. Iterate through q's parents until you find value present in ancestors. 
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        HashMap<TreeNode, TreeNode> parents = new HashMap<>(); 
        Stack<TreeNode> stack = new Stack<>(); 
        
        parents.put(root, null);    //Root has no parent. 
        stack.push(root); 
        
        while(parents.containsKey(p) == false || parents.containsKey(q) == false) { 
        
            TreeNode parent = stack.pop(); 
            
            if(parent.left != null) { 
                parents.put(parent.left, parent); 
                stack.push(parent.left);
            }
            if(parent.right != null) { 
                parents.put(parent.right, parent);
                stack.push(parent.right); 
            }
        
        }
        
        ArrayList<TreeNode> ancestors = new ArrayList<>();
        
        while(p != null) { 
            ancestors.add(p); 
            p = parents.get(p); 
        }
        
        while(ancestors.contains(q) == false) { 
            q = parents.get(q);
        }
        
        return q;
        
    }

}
