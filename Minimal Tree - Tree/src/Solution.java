
public class Solution {
	
	class TreeNode { 
		int val; 
		TreeNode left,right; 
		TreeNode(int x) { 
			val = x; 
		}
	}
	
	 public TreeNode sortedArrayToBST(int[] nums) { 
         return sortedArrayToBST(nums, 0, nums.length - 1);
    }
    
    
    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        
        if(end < start) { 
            return null;
        }
        
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = sortedArrayToBST(nums, start, mid-1); 
        n.right = sortedArrayToBST(nums, mid+1, end);
        
        return n;
         
    }

}
