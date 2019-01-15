
public class MaxAreaWater2 {
	
	 public int maxArea(int[] height) {
	        
	        int l = 0;
	        int r = height.length - 1; 
	        int max = 0;
	        
	        //We know that the height of the rectangle will be delimited by the shortest height. 
	        //We can start one pointer at beginning & one at the end. 
	        //Based on the height of those two, we will make them get closer by the front or back. 
	        
	        while (l < r) {
	            int area = Math.min(height[l], height[r]) * (r - l);
	            
	            if(max < area){
	                max = area; 
	            }
	            
	            if(height[l] > height[r]) {
	                r--;
	            }
	            else {
	                l++;
	            }
	        }
	        
	        return max; 
	        
	    }


}
