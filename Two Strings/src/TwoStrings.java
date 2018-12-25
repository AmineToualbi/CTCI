import java.util.HashMap;

/*Given two strings, determine if they share a common substring. A substring may be as small as one character.

For example, the words "a", "and", "art" share the common substring "a". The words "be" and "cat" do not share a substring.
*/

public class TwoStrings {
	
	    // Complete the twoStrings function below.
	    static String twoStrings(String s1, String s2) {

	        HashMap<Character, Integer> m1 = new HashMap<>(); 

	        //Count occurrences in first string.
	        for(int i=0; i<s1.length(); i++) { 
	            char c = s1.charAt(i); 
	            Integer count = m1.get(c); 
	            if(count == null) {
	                count = 1; 
	                m1.put(c, count);
	            }
	            else {
	                m1.put(c, count+1);
	            }
	        } 

	        for(int i=0; i<s2.length(); i++) { 
	            char c = s2.charAt(i); 
	            if(m1.get(c) != null) { 
	                return "YES";
	            }
	        }

	        return "NO";


	    }

}
