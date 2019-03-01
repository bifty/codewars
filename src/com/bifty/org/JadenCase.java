package com.bifty.org;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JadenCase {

	  public static final Collector<CharSequence,?,String> JOIN_WITH_SPACE = Collectors.joining(" ");

	  public String toJadenCase(String phrase) {
	    if (phraseIsEmpty(phrase)) { return null; }
	    
	    return Arrays.stream(splitIntoWords(phrase)).map(this::capitalize).collect(JOIN_WITH_SPACE);
	  }

	  private String[] splitIntoWords(String phrase) {
	    return phrase.split(" ");
	  }
	  
	  private String capitalize(String word) {
	    return word.substring(0, 1).toUpperCase() + word.substring(1);
	  }
	  
	  private boolean phraseIsEmpty(String phrase) {
	    return phrase == "" || phrase == null;
	  }

}