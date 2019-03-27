package com.bifty.org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalenderWeekTest {

	@Test
	public void exampleTests() {
		assertEquals(52, CalenderWeek.getCalendarWeek("2017-01-01"));
		assertEquals(52, CalenderWeek.getCalendarWeek("2018-12-24"));
		assertEquals(1, CalenderWeek.getCalendarWeek("2018-12-31"));
		assertEquals(1, CalenderWeek.getCalendarWeek("2019-01-01"));
		assertEquals(9, CalenderWeek.getCalendarWeek("2016-02-29"));
		assertEquals(53, CalenderWeek.getCalendarWeek("2015-12-29"));
	}

}
