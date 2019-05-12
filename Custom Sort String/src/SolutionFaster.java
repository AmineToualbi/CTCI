class SolutionFaster {
    
    public String customSortString(String S, String T) {
        
        int[] count = new int[26];
        
        for(int i=0; i<T.length(); i++) {
            char t = T.charAt(i);
            int numVal = t - 'a';
            count[numVal]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<S.length(); i++) {
            char s = S.charAt(i);
            int numVal = s - 'a';
            while(count[numVal] > 0) {
                sb.append(s);
                count[numVal]--;
            }
        }
        
        
        for(char c = 'a'; c <= 'z'; c++)  {
            while(count[c - 'a'] > 0) {
                sb.append(c);
                count[c-'a']--;
            }
        }
        
        return sb.toString();
        
    }
    
}