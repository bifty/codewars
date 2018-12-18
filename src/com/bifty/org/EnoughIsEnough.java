package com.bifty.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		List<Integer> resultList;
		List<Integer> pictureList =  Arrays.stream(elements).boxed().collect(Collectors.toList());

		resultList = pictureList.stream().distinct().collect(Collectors.toList());
		
		return resultList.stream().mapToInt((Integer i)->i).toArray();
	}

}
