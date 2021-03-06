
public class Driver {
	
	
	public static int getCharNumber(char character) {
		
		int z = Character.getNumericValue('z');
		System.out.println(z);
		int a = Character.getNumericValue('a');
		System.out.println(a);
		int c = Character.getNumericValue(character);
		
		if(c >= a && c <= z) {
			System.out.println(c -a);
			return c - a;
		}
		return -1;
		
		
	}
	
	public static int[] populateOccurences(String str) {
		int[] table = new int[26];
		for(int i=0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			int cVal = getCharNumber(c);
			if(cVal >= 0) {
				table[cVal]++;
			}
			
		}
		for(int i=0; i<26; i++) {
			System.out.println(" i = " + i + " :" + table[i]);
		}
		return table;
	}

	
	public static boolean isPermutationOfPalindrome(String str) {
		
		int[] table = populateOccurences(str);
		boolean oddOccured = false;
		for(int i=0; i<table.length; i++) {
			if(table[i] % 2 != 0) {
				if(oddOccured == false) {
					oddOccured = true;
				}
				else {
					return false;
				}
			}
		}
		return true;
		
	}
	
	

	public static void main(String[] args) {
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali));
	}

}
