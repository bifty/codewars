package com.bifty.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EnoughIsEnough {

	public int[] deleteNth(int[] list, int maxOccurence) {
		List<Integer> resultList;
		List<Integer> pictureList =  Arrays.stream(list).boxed().collect(Collectors.toList());


		resultList = pictureList.stream().distinct().collect(Collectors.toList());
		
		return resultList.stream().mapToInt((Integer i)->i).toArray();
	}

}
