
public class PhoneNoCombination {
	
	  public List<String> letterCombinations(String digits) {
	        
	        
	        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	        LinkedList<String> sol = new LinkedList<>();
	        if(digits.equals("")) return sol;
	        sol.add("");
	        
	        //You know that if digits.length = 2, all the substrings will have 2 letters. If it's 3, they will have 3 letters etc... 
	        //You keep pushing in & out the substrings from the queue until you get out of the loop. 
	        //while(sol.peel.length == i) means that if we are currently at the second digit => i = 1 & we wanna kick all the susbtrings with a length of 1 & add new characters to them. 
	        for(int i=0; i<digits.length(); i++){
	            char c = digits.charAt(i);
	            int charVal = Character.getNumericValue(c);
	                
	            while(sol.peek().length() == i) {
	                String t = sol.poll();
	                
	                for(int j=0; j<map[charVal].length(); j++){
	                    char newCharToAdd = map[charVal].charAt(j);
	                    sol.add(t+newCharToAdd);
	                }
	            }
	            
	        }
	        
	        return sol;
	        
	    }

}
