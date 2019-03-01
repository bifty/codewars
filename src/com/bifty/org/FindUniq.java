package com.bifty.org;

import java.util.Arrays;
//import java.util.Map.Entry;
//import static java.util.function.Function.identity;
//import static java.util.stream.Collectors.counting;
//import static java.util.stream.Collectors.groupingBy;

public class FindUniq {

	public static double findUniq(double arr[]) {
	      Arrays.sort(arr);
	      return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
	      
//	      return Arrays.stream(arr).boxed()
//	                .collect(groupingBy(identity(), counting()))
//	                .entrySet().stream()
//	                .filter(e -> e.getValue() == 1)
//	                .findFirst()
//	                .map(Entry::getKey)
//	                .orElse(0.0);
	    }
    
}
