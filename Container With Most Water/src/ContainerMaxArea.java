
public class ContainerMaxArea {
	
	  public int maxArea(int[] height) {
	        
	        int maxArea = 0; 
	        
	        int start = 0;
	        int end = height.length-1; 
	        
	        while(start < end) {
	            
	            int currentArea = (end-start) * Math.min(height[start], height[end]);
	            if(currentArea > maxArea) maxArea = currentArea; 
	            
	            if(height[start] > height[end]) {
	                end--; 
	            }
	            else {
	                start++; 
	            }
	        }
	        
	        return maxArea; 
	        
	    }

}
