package com.cts;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddClassTest {

	AddClass ac=new AddClass();
	
	@Test
	public void testAddnumber() {
		
		assertEquals(ac.addnumber(5, 5), 10);
	}

}
