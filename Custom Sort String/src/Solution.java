class Solution {
    
    HashMap<Character, Integer> hmap = new HashMap<>(); 
    
    public String customSortString(String S, String T) {
        
        hmap = populateMap(T);
        String toAdd = findMatchingLetters(S, T); 
        System.out.println(toAdd);
        
        String sol = toAdd; 

        for(int i=0; i<T.length(); i++) {
            char c = T.charAt(i);
            if(hmap.get(c) > 0) {
                int freq = hmap.get(c);
                hmap.put(c, freq-1);
                sol += c;
            }
        }
        
        return sol;
        
    }
    
    public HashMap populateMap(String T) {
        for(int i=0; i<T.length(); i++){ 
        
            char c = T.charAt(i);
            if(hmap.get(c) == null) hmap.put(c, 1);
            else {
                hmap.put(c, hmap.get(c)+1);
            }
            System.out.println(c + " - " + hmap.get(c));
        }
        
        return hmap; 
    }
    
    public String findMatchingLetters(String S, String T) {
        
        String toAdd = "";
        for(int i=0; i<S.length(); i++) {
            char s = S.charAt(i);
            for(int j=0; j<T.length(); j++) {
                char t = T.charAt(j); 
                if(s == t && hmap.get(s) > 0) {
                    int freq = hmap.get(s);
                    hmap.put(s, freq-1);
                    toAdd += t;          
                } 
            }
        }
        
        return toAdd; 
        
    }
    
}