package com.bifty.org;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HighestScoringWordTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }
}
