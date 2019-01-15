import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
	
public int lengthOfLongestSubstring(String s) {
        
        int answer = 0; 
        int n = s.length();
        //I & J will be used to keep track of our set of indexes [i,j] that we are evaluating.
        //e.g.: pwwkew
        //We start at [0,0] -> p. 
        //[0,1] -> pw. 
        //[0,2] -> pww -> ERROR. 
        //We want to remove w.
        //i = Math.max(previousPOSITIONOf'w', i) = 2. 
        //New set = [2,2] -> w. 
        //We move this way through the string. 
        
        Map<Character, Integer> map = new HashMap<>(); 
        
        for(int i=0, j=0; j<n; j++) { 
        
            if(map.containsKey(s.charAt(j))) { 
                i = Math.max(map.get(s.charAt(j)), i);
            }
            
            answer = Math.max(answer, j - i + 1); 
            map.put(s.charAt(j), j+1);      //We store character & its position in the array, not INDEX!
        
        }
        
        return answer;
        
        
      
    }

}
