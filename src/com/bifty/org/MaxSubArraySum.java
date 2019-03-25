package com.bifty.org;

public class MaxSubArraySum {

	public static int sequence(int[] arr) {
		int currentSum = 0;
		int greatestSum = 0;

		for (int item : arr) {
			if (greatestSum < item + currentSum) {
				currentSum = currentSum + item;
				greatestSum = currentSum;

			} else if (greatestSum < item) {
				greatestSum = item;
				currentSum = item;
			} else {
				currentSum = currentSum + item > 0 ? currentSum + item : 0;
				if (greatestSum < currentSum)
					greatestSum = currentSum;

			}
		}

		return greatestSum;
	}

}
