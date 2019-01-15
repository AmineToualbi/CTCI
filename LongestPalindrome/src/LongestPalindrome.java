public class LongestPalindrome {
    
    public String longestPalindrome(String s) {
     
        if(s == null || s.length() == 0) return "";
        
        int start = 0;      //Start keeps track of index of first letter of palindrome.
        int end = 0;        //End keeps track of index of last letter of palindrome.
        
        for(int i=0; i<s.length(); i++){
            
            //1. Get the lengths of the possible palindromes around s.charAt(i). 
            //e.g.: babad => possible palindromes: b, a, bab, aba, a, d. 
            //len1 returns the length of the first palindrome, starting by comparing a letter to itself bc the letter alone is a palindrome too. It will go behind by 1 & up by 1 to continue comparing around the center i. 
            //len2 checks if two same letters are consecutive. 
            //e.g.: cbbd. => checking only for (i,i) in the case of (1,1) will do 1,1, 0,2 & return. We miss (1,2). 
            //We have to check for (1,2) at the beginning then. 
            int len1 = palindromeAroundCenter(s, i, i);
            int len2 = palindromeAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);         //Get the length of the highest palindrome we found. 
            
            if(len > end - start){
                start = i - (len - 1) / 2; 
                end = i + len / 2;
            }
            
        }
        
        return s.substring(start, end+1);
    }
    
    public int palindromeAroundCenter(String s, int left, int right) {
        int l = left;
        int r = right; 
        
        //If the right char is equal to the left char, you go one to the left & one to the right to continue evaluating.
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        
        return r - l - 1;
    }
}




