package com.example.test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExample {
	
	private Example ex = new Example();
	
	@Test
	public void simpleAdd() throws Exception {
		assertEquals(2, ex.example(1, 1));
		assertEquals(3, ex.example(1, 2));
	}
	
	@Test
	public void zero() throws Exception {
		assertEquals(0, ex.example(0, 0));
	}
	
	@Test
	public void overflow() throws Exception {
		assertEquals(Integer.MIN_VALUE, ex.example(Integer.MAX_VALUE, 1));
	}
}
