
public class LongestPalindrome3 {
		    public String longestPalindrome(String s) {
	        
	        int startIndex = 0;
	        int endIndex = s.length() - 1;  //[0,4]
	        String sol = "";
	        int currentMax = 0;
	        boolean palFound = false; 
	        
	        if(s.length() <= 1 ) {
	            return s;
	        }
	        
	        for(int i=0; i<s.length(); i++) {
	            for(int j=s.length()-1; j>i; j--) {
	                
	                if(isPalindrome(s, i, j)) {
	                    //System.out.println("Palindrome found for [" + i + ", " + j + "]");
	                    int lengthOfPal = j - i + 1;
	                    palFound = true;
	                    if(lengthOfPal > currentMax) {
	                        sol = s.substring(i, j+1);
	                        currentMax = lengthOfPal;
	                    }
	                    break;
	                }
	                
	            }
	        }
	        
	        if(palFound == false) return s.charAt(0) + "";
	        return sol;
	        
	    }
	    
	    public boolean isPalindrome(String s, int i, int j) {
	        
	        char start = s.charAt(i);
	        char end = s.charAt(j);
	        
	        if(start == end) {
	            while(i < j) {
	                char currentLeft = s.charAt(i);
	                char currentRight = s.charAt(j);
	                
	                if(currentLeft != currentRight) {
	                    return false; 
	                }
	                
	                i++;
	                j--;
	            }
	        }
	        else {
	            return false; 
	        }
	     
	        return true; 
	        
	    }

}
