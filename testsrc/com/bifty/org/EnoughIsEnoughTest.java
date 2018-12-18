package com.bifty.org;

import static org.junit.Assert.*;
import org.junit.Test;

public class EnoughIsEnoughTest {

	EnoughIsEnough enough = new EnoughIsEnough();

	@Test
	public void test() {
		assertArrayEquals(new int[] {20,37,21}, enough.deleteNth(new int[] {20,37,20,21}, 1));
		//assertEquals(new int[] {20,37,21}, enough.deleteNth(new int[] {20,37,20,21}, 1));
	}

}
