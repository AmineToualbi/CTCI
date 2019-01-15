public class LongestPalindrome2 {
    
    public String longestPalindrome(String s) {
     
        int max = 0;
        String result = "";
        
        //We start from the front & end of the string & compare by going one up & one down every time. 
        //e.g.: ababbd. 
        //We start with a & compare to d. This is no palindrome. 
        //Then a & b, no palindrome. a & b no palindrome. 
        //Then a & a, palindrome. We go up one & one down, still a palindrome. We stop when i == j or i > j. 
        for(int i=0; i<s.length(); i++){
            for(int j=s.length()-1; j>=i; j--){
                
                if(isPalindrome(s, i, j) == true){
                    if(max < j - i + 1) {           // j - 1 + 1 returns the length of the palindrome fround. 
                        max = j - i + 1; 
                        result = s.substring(i, j+1);
                    }
                    break;          //break because we found the longest palindrome. There's no need to go further down. 
                }
                
            }
        }
        
        return result;
    }
    
    
    
    public boolean isPalindrome(String s, int i, int j){
        
        
        if(i == j || i > j) return true;        //If we are evaluating the same letter or if we finished evaluating the palindrome, return. 
        
        return s.charAt(i) == s.charAt(j) && isPalindrome(s, i+1, j-1);
        
        
    }
}