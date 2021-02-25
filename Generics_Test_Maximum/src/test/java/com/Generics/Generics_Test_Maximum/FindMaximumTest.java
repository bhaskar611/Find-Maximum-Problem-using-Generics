package com.Generics.Generics_Test_Maximum;

import org.junit.Assert;
import org.junit.Test;
public class FindMaximumTest {
	
	
	@Test
	public void maximumObjectIntegerposition1() {
		Integer maximumObject = FindMaximum.maximumOfObject(999, 99, 9);
		
		Assert.assertEquals((Integer) 999, maximumObject);
	}
	@Test
	public void maximumObjectIntegerposition2() {
		Integer maximumObject = FindMaximum.maximumOfObject(99, 999, 9);
		
		Assert.assertEquals((Integer) 999, maximumObject);
	}
	@Test
	public void maximumObjectIntegerposition3() {
		Integer maximumObject = FindMaximum.maximumOfObject(9, 99,999);
		
		Assert.assertEquals((Integer) 999, maximumObject);
	}

	
	@Test
	public void maximumObjectFloatposition1() {
		Float maximumObject = FindMaximum.maximumOfObject(15.69f, 12.36f, 6.96f);
		Assert.assertEquals((Float) 15.69f, maximumObject);
	}
	
	@Test
	public void maximumObjectFloatposition2() {
		Float maximumObject = FindMaximum.maximumOfObject(12.36f, 15.69f, 6.96f);
		Assert.assertEquals((Float) 15.69f, maximumObject);
	}
	@Test
	public void maximumObjectFloatposition3() {
		Float maximumObject = FindMaximum.maximumOfObject(12.36f, 6.96f, 15.69f);
		Assert.assertEquals((Float) 15.69f, maximumObject);
	}

	
	@Test
	public void maximumObjectStringposition1() {
		String maximumObject = FindMaximum.maximumOfObject("peach", "apple", "banana");
		Assert.assertEquals((String) "peach", maximumObject);
	}
	@Test
	public void maximumObjectStringposition2() {
		String maximumObject = FindMaximum.maximumOfObject("peach", "apple", "banana");
		Assert.assertEquals((String) "peach", maximumObject);
	}
	@Test
	public void maximumObjectStringposition3() {
		String maximumObject = FindMaximum.maximumOfObject("peach", "apple", "banana");
		Assert.assertEquals((String) "peach", maximumObject);
	}
	
	
}