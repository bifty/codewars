package com.bifty.org;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindUniqTest {

    private double precision = 0.0000000000001;
    
    
    @Test
    public void ownTestCases() {
    	assertEquals(3.0,  FindUniq.findUniq(new double[] {3, 4, 5, 6}), precision);
    	assertEquals(3.0,  FindUniq.findUniq(new double[] {4, 3, 5, 6}), precision);
    	assertEquals(3.0,  FindUniq.findUniq(new double[] {4, 3, 4, 5, 5, 6, 4, 6}), precision);
    	assertEquals(5.0,  FindUniq.findUniq(new double[] {4, 3, 4, 3, 5, 6, 4, 6}), precision);
    	
    }
    
    
    
    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUniq.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUniq.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }

}
