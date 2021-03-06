
public class Driver {
	
	//Runs in O(n^2)
	public static boolean permutation(String w1, String w2) {
		
		StringBuilder check = new StringBuilder();
		boolean[] used = new boolean[w2.length()];
		
		for(int i=0; i<w2.length(); i++) {
			used[i] = false;
		}
		
		for(int i=0; i<w1.length(); i++) {
			char c = w1.charAt(i);
			for(int j=0; j<w2.length(); j++) {
				if(c == w2.charAt(j) && used[j] == false) {
					check.append(c);
					used[j] = true;
					break;
				}
			}
		}
		
		for(int i=0; i<w1.length(); i++) {
			if(w1.charAt(i) != check.charAt(i)) {
				return false;
			}
		}
		
		
		return true;
		
	}
	
	public static  boolean bookSolution(String w1, String w2) {
		
		char[] letters = new char[128];
		
		for(int i=0; i<w1.length(); i++) {
			letters[w1.charAt(i)]++;
		}
		
		for(int i=0; i<w2.length(); i++) {
			letters[w2.charAt(i)]--;
		}
		for(int i=0; i<w2.length(); i++) {
			if(letters[w2.charAt(i)] != 0) {
				return false;
			}
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		String[][] pairs = {{"amine", "enime"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = bookSolution(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}

	}

}
