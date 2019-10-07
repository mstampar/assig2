package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingMachineTest
{

	@Test
	public void testGetTotal() 
	{
		AddingMachine myCalculator = new AddingMachine;
		int expectedTotal = 0;
		int actualTotal = myCalculator.getTotal();
		assertEquals(expectedTotal,actualTotal);
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

}
