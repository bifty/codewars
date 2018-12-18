package com.bifty.org;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DRootTest {

	@Before
	public void setUp() throws Exception {
	}


    @Test
    public void testDigital_root() {
      assertEquals( "Nope!" , 5, DRoot.digital_root(5));    
      assertEquals( "Nope!" , 7, DRoot.digital_root(16));
      assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }
}
