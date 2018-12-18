package com.bifty.org;

import java.util.LinkedList;

public class DRoot {
	  public static int digital_root(int n) {
	    int result = n;

	    while (result >= 10) {
	    	result = sumUp(result);
	    }
	    
	    return result;
	  }

	private static int sumUp(int n) {
	    LinkedList<Integer> list = new LinkedList<Integer>();
		while (n > 0) {
			list.push(n % 10);
			n = n / 10;
		}
		return list.stream().mapToInt(Integer::intValue).sum();
	}
}