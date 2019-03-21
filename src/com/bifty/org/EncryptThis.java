package com.bifty.org;

public class EncryptThis {

    public static String encryptThis(String text) {

    	if (text.length() == 0) return text;
    	
    	StringBuffer encodedOutput = new StringBuffer();

    	String[] splittedWords = text.split(" ");
    	
    	
    	for (String word: splittedWords) {
    		
    		if (word.length() > 0) {
    			
    			encodedOutput.append(encodeFirstLetter(word));
    		}
    		
    		if (word.length() == 2) {
    			encodedOutput.append(unencodedSecondLetter(word));
    		}
    		
    		else if (word.length() > 2) {
    			encodedOutput.append(encodedSecondLetter(word));

    			encodedOutput.append(addMiddleLetters(word));

    			encodedOutput.append(encodedLastLetter(word));
    		}
    		encodedOutput.append(" ");
    	}

		
    	encodedOutput.delete(encodedOutput.length() - 1, encodedOutput.length());
    	return encodedOutput.toString();
    }

	private static char encodedLastLetter(String word) {
		char secondLetter = word.charAt(1);
		return secondLetter;
	}

	private static char encodedSecondLetter(String word) {
		char lastLetter = word.charAt(word.length() - 1);
		return lastLetter;
	}

	private static String addMiddleLetters(String word) {
		return word.substring(2, word.length() -1);
	}

	private static char unencodedSecondLetter(String word) {
		return word.charAt(1);
	}

	private static String encodeFirstLetter(String word) {
		char firstLetter = word.charAt(0);
		String firstLetterEncoded = Integer.toString((int) firstLetter);
		
		return firstLetterEncoded;
	}
    
}
