import java.util.ArrayList;

/*Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.

For example s = mom, the list of all anagrammatic pairs is [m,m] & [mo, om]. 
*/

public class Solution {

    //1. Create array with all possible substrings: k * (k+1)/2
    //2. Create fct to compare 2 substrings to check if anagram. 
    //3. Count anagrams. 
	
    static int sherlockAndAnagrams(String s) {

        //Create array with all possible substrings. 
        ArrayList<String> arr = new ArrayList<String>(); 
        int count = 0;

        //1. Create array containing all possible substrings. 
        for(int i=0; i<s.length(); i++){ 			
            for(int j=i+1; j<s.length()+1; j++) { 
                String sub = s.substring(i, j);
                arr.add(sub); 
            }
        }
        

        //Go through all substrings & compare them to each other in literal order to check for anagram. 
        for(int i=0; i<arr.size(); i++) { 
            String s1 = arr.get(i); 
            for(int j=i+1; j<arr.size(); j++) { 
                String s2 = arr.get(j);
                if(s1.length() == s2.length()) {
                    if(compareStrings(s1, s2) == true) {
                        count++; 
                    }
                }
            }
        }

        return count; 

    }

    //2. Check if 2 strings are anagrams.
    static boolean compareStrings(String s1, String s2) { 

        int[] set1 = new int[26];
        int[] set2 = new int[26]; 

        for(int i=0; i<s1.length(); i++) {      //Count char occurrences in s1. 
            char c = s1.charAt(i); 
            int index = getCharNumber(c);
            set1[index]++; 
        } 
        
        for(int i=0; i<s2.length(); i++){       //Count char occurrences in s2.
            char c = s2.charAt(i); 
            int index = getCharNumber(c); 
            set2[index]++; 
        }

        //If the two substrings have the same number of occurrences for every char: 
        //It means that they are substrings of each other. e.g.: bba & aab. 
        for(int i=0; i<26; i++) {               
            if(set1[i] != set2[i]) { 
                return false;
            }
        }

        return true; 
    }

    static int getCharNumber(char c) { 
        int z = Character.getNumericValue('z');
        int a = Character.getNumericValue('a');
        int ch = Character.getNumericValue(c);

        if (ch >= a && ch <= z) {
            return ch - a;
        }
        return -1;
    }
    
}
