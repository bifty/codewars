package com.bifty.org;

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
    	String result = "";
    	
    	for (int i = 0; i + k <= strarr.length; i++) {
    		String tmp = "";
    		for (int j = 0; j < k ; j++) {
    			tmp += strarr[i+j];
    			
    		}
    		if (tmp.length() > result.length()) {
    			result = tmp;
    		}
    	}
    	
    	return result;
    	
    }
}
