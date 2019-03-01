package com.bifty.org;

public class JadenCase {

	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.equals("")) return null;
		
		String[] words = phrase.split(" ");
		String newPhrase = "";
		
		for (String word : words) {
			String newBegining = word.substring(0,1).toUpperCase();
			String newWord = newBegining.concat(word.substring(1, word.length()));
			newPhrase += newWord + " ";
		}
		
		return newPhrase.trim();
	}

}