
public class QuestionA {
	
	//This first method runs in O(n^2). 
	public static boolean isUniqueChars(String word) {
		
		for(int i=0; i<word.length()-1; i++) {
			char current = word.charAt(i);
			for(int j=i+1; j<word.length(); j++) {
				if(current == word.charAt(j)) {
					return false;
				}
			}
		}
		
		return true;		
	}
	
	//This method runs in O(n).
	public static boolean isUniqueChar(String word) {
		
		//128 because it's the number of characters available.
		boolean[] charIsInString = new boolean[128];
		
		for(int i=0; i<word.length(); i++) {
			int currentChar = word.charAt(i);
			if(charIsInString[currentChar] == true) {
				return false;
			}
			charIsInString[currentChar] = true;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChar(word));
		}

	}

}
