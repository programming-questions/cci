package array_and_strings_1;

import java.util.*;

public class Q1_1 {
	
	//O(log n)
	public boolean isUnique (String word) {
		char[] striToChar = word.toCharArray();
		Arrays.sort(striToChar);
		for(int i = 0; i < striToChar.length - 1; i++) {
			if(striToChar[i] == striToChar[i+1]) {
				return true;
			}
		} return false;

		
	}
	
	public static void main(String[] args) {
//		List <String> word = new ArrayList<String>();
//		word.add("hello");
//		word.add("ann");
		String word = "Gbemisolaa";
		Q1_1 is = new Q1_1();
		System.out.println(is.isUnique(word));
		
//		String testString = "This Is Test";
//		char[] stringToCharArray = testString.toCharArray();
// 
//		for (char output : stringToCharArray) {
//			System.out.println(output);
//		}
	}

}

