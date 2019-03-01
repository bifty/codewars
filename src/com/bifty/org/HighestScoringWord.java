package com.bifty.org;

public class HighestScoringWord {

    private static final int _ASCIIDIFF = 96;

	public static String high(String sentence) {
    	String[] words;
    	String highestScoreWord;
    	int highestScore;
    	
    	words = sentence.toLowerCase().split(" ");
    	highestScore = 0;
    	highestScoreWord = words[0];
    	
    	
    	for (int i = 0; i < words.length; i++) {
    		int newWordScore;
    		
    		newWordScore = calculateWordScore(words[i]);
    		
    		if (newWordScore > highestScore) {
    			highestScore = newWordScore;
    			highestScoreWord = words[i];
    		}
		}
    	

//    	small but cpu consuming strategy:
//        return Arrays.stream(s.split(" "))
//                .max(Comparator.comparingInt(
//                        a -> a.chars().map(i -> i - 96).sum()
//                )).get(); 
//		}

    	return highestScoreWord;
    }		

	private static int calculateWordScore(String word) {
		int wordScore = 0;
		
		char[] characters = word.toCharArray();
		
		for (char c : characters) {
			wordScore += Math.subtractExact((int) c, _ASCIIDIFF);
		}
		
		return wordScore;
	}


}