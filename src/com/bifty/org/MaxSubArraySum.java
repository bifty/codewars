package com.bifty.org;

public class MaxSubArraySum {

	public static int sequence(int[] arr) {
		if (arr.length == 0)
			return 0;

		int sum = 0;
		for (int item : arr) {
			if (item > 0)
				sum += item;
		}

		if (sum < 0)
			return 0;

		return sum;
	}

}
