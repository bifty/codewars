package com.bifty.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		final List<Integer> resultList = new ArrayList<Integer>();
		Map<Integer, Integer> elementCounter = new HashMap<>();
		List<Integer> pictureList =  Arrays.stream(elements).boxed().collect(Collectors.toList());

		pictureList.forEach(element -> {
			int count = elementCounter.containsKey(element) ? elementCounter.get(element) : 0;
			if (count < maxOccurrences) {
				resultList.add(element);
				elementCounter.put(element, count + 1);
			}
		});
				
		return resultList.stream().mapToInt((Integer i)->i).toArray();
	}

}
