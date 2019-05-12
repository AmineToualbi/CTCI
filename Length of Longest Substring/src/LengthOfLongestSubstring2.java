
public class LengthOfLongestSubstring2 {
	    public int lengthOfLongestSubstring(String s) {
	        
	        HashMap<Character, Boolean> hmap = new HashMap<>(); 
	        
	        int sol = 0;
	        int currentLength = 0;
	        int index = 1;
	        
	        for(int i=0; i<s.length(); i++) {
	            
	            char c = s.charAt(i);
	            
	            if(hmap.get(c) == null || hmap.get(c) == false) {
	              //  System.out.println("false for " + c);
	                hmap.put(c, true);
	                currentLength++;
	            }
	            else {
	                if(currentLength > sol) {
	                    sol = currentLength; 
	                    //System.out.println("\tSol = " + sol);
	                }
	               // System.out.println("true for " + c);
	                hmap = new HashMap<>();
	                i = index-1;
	                index++;
	                currentLength = 0;

	            }
	        }
	        
	        if(currentLength > sol) {
	            sol = currentLength; 
	        }
	        return sol;
	        
	    }
	    
}
