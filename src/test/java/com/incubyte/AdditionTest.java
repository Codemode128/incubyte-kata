package com.incubyte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionTest{
 Addition add = new Addition();
 
 @Test
 public void test_for_empty_string() {
	 assertEquals(0,add.Add(""));
 }
}
