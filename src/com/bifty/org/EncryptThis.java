package com.bifty.org;

public class EncryptThis {

    public static String encryptThis(String text) {

    	if (text.equals("")) return text;
    	
    	StringBuffer encoded = new StringBuffer();

    	String[] splittedWords = text.split(" ");
    	
    	for (String word: splittedWords) {
    		
    		char firstLetter = word.charAt(0);
    		String firstLetterEncoded = Integer.toString((int) firstLetter);
    		
    		encoded.append(firstLetterEncoded);
    		
    		if (word.length() == 2) {
    			encoded.append(word.charAt(1));
    		}
    		
    		else if (word.length() > 2) {
    			char secondLetter = word.charAt(1);
    			char lastLetter = word.charAt(word.length() - 1);
    			
    			char secondLetterEncoded = lastLetter;
    			char lastLetterEncoded = secondLetter;
    			
    			encoded.append(secondLetterEncoded);
    			encoded.append(word.substring(2, word.length() -1));
    			encoded.append(lastLetterEncoded);
    		}
    		encoded.append(" ");
    	}

		
    	return encoded.toString().trim();
    }
    
}
