import java.util.HashMap;
import java.util.Map;

public class SparseArrays {
	
	//https://www.hackerrank.com/challenges/sparse-arrays/problem
	
	 // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
       Map<String, Integer> hmap = new HashMap<>(); 
       int[] sol = new int[queries.length];
       
       for(int i=0; i<queries.length; i++) {
           hmap.put(queries[i], 0);
       }
       for(int i=0; i<strings.length; i++) {
           if(hmap.containsKey(strings[i])) {
               hmap.put(strings[i], hmap.get(strings[i])+1);
           }          
       }
       for(int i = 0; i<queries.length; i++) {
           sol[i] = hmap.get(queries[i]);
       }

       return sol; 
    }

}
