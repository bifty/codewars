package com.bifty.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		final List<Integer> resultList = new ArrayList<Integer>();
		Map<Integer, Integer> elementCounter = new HashMap<>();

		for (final Integer element : elements) {
			final Integer count = elementCounter.put(element, elementCounter.getOrDefault(element, 0) + 1);
			if (count == null || count < maxOccurrences) {
				resultList.add(element);
			}
		};
				
		return resultList.stream().mapToInt(i->i).toArray();
	}

}
