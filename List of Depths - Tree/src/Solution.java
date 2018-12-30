import java.util.LinkedList;
import java.util.List;

//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level). 
// = Create linkedlist of nodes at each depth. 


 // Definition for a binary tree node.
   class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new LinkedList<>();
        
        if(root == null) { 
            return list;
        }
        
        List<Integer> current = new LinkedList<>(); 
        List<TreeNode> currentNode = new LinkedList<>(); 
        
        current.add(root.val);
        currentNode.add(root); 
        
        while(current.size() > 0) { 
        
            list.add(current); 
            List<TreeNode> parents = currentNode; 
            currentNode = new LinkedList<>(); 
            current = new LinkedList<>(); 
            
            for(TreeNode parent : parents) { 
                if(parent.left != null) { 
                    current.add(parent.left.val); 
                    currentNode.add(parent.left); 
                }
                if(parent.right != null) { 
                    current.add(parent.right.val);
                    currentNode.add(parent.right);
                }
            }
        
        }
        
        return list; 
    }
}