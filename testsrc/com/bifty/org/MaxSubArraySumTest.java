package com.bifty.org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSubArraySumTest {

	@Test
	public void testEmptyArray() throws Exception {
		assertEquals("Empty arrays should have a max of 0", 0, MaxSubArraySum.sequence(new int[] {}));
	}

	@Test
	public void negativeNumbersHaveNullAsMax() {
		assertEquals("Only negativer numbers should return 0", 0, MaxSubArraySum.sequence(new int[] { -2, -3, -16 }));
	}

	@Test
	public void testOneNumber() throws Exception {
		assertEquals(6, MaxSubArraySum.sequence(new int[] { 6 }));
	}

	@Test
	public void testTwoNumbers() throws Exception {
		assertEquals(10, MaxSubArraySum.sequence(new int[] { 6, 4 }));
	}

	@Test
	public void shouldIgnoreLastNegativeNumber() throws Exception {
		assertEquals(10, MaxSubArraySum.sequence(new int[] { 6, 4, -2 }));
	}

	@Test
	public void shouldNotIgnoreNegativeNumberIfFollowedByPositiveNumberProducingHigherSum() throws Exception {
		assertEquals(17, MaxSubArraySum.sequence(new int[] { 6, 4, -2, 9 }));
	}

	@Test
	public void testExampleArray() throws Exception {
		assertEquals("Example array should have a max of 6", 6,
				MaxSubArraySum.sequence(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

}
