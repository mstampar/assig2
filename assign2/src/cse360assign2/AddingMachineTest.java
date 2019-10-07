package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore; 
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure; 

public class AddingMachineTest {


	@Test
	public void testGetTotal() 
	{
		AddingMachine myCalculator = new AddingMachine();
		int expectedTotal = 0;
		int actualTotal = myCalculator.getTotal();
		assertEquals(expectedTotal,actualTotal);
	}

	@Test
	public void testAdd() 
	{
		AddingMachine myCalculator = new AddingMachine();
		int expectedTotal = 4;
		myCalculator.add(4);
		int actualTotal = myCalculator.getTotal();
		assertEquals(expectedTotal,actualTotal);
	}

	@Test
	public void testSubtract()
	{
		AddingMachine myCalculator = new AddingMachine();
		int expectedTotal = -4;
		myCalculator.subtract(4);
		int actualTotal = myCalculator.getTotal();
		assertEquals(expectedTotal,actualTotal);
	}

	@Test
	public void testToString() 
	{
		AddingMachine myCalculator = new AddingMachine();
		String expectedHistory = Integer.toString(0);
		String actualHistory = myCalculator.toString();
		assertEquals(expectedHistory,actualHistory);
	}
	
	@Test
	public void testHistoryUpdates() 
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		String expectedHistory = "0+4-2+5";
		String actualHistory = myCalculator.toString();
		assertEquals(expectedHistory,actualHistory);
	}

	@Test
	public void testClear() 
	{
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.clear();
		String expectedHistory = Integer.toString(0);
		String actualHistory = myCalculator.toString();
		assertEquals(expectedHistory,actualHistory);
		int expectedTotal = 0;
		int actualTotal = myCalculator.getTotal();
		assertEquals(expectedTotal,actualTotal);
	}

}
