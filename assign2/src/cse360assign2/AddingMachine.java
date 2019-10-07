/**
 * The AddingMachine class for Assignment2
 * 
 * @author mojca stampar
 * @version 2.0 final
 * @since 2019-06-10
 */
package cse360assign2;
import java.lang.*;

public class AddingMachine {

	/**
	 * The total of our calculations and the history of our transactions
	 */
	private int total;
	private String history;
	
	/**
	 * Creates a new AddingMachine object with 0 total and history 
	 * containing just the 0 total
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		history = Integer.toString(total);
	}
	
	/**
	 * A method returning a current total from AddingMachine
	 * @return current total
	 */
	public int getTotal () 
	{
		//System.out.println(Integer.toString(total));
		return total;
	}
	
	/**
	 * This method is used to add the parameter to the total variable
	 ** and update the String containing the history
	 * @param value This is the parameter for add method
	 * @return Nothing
	 */
	public void add (int value)
	{
		total = total + value;
		//System.out.println(Integer.toString(total));
		history = history + "+" + Integer.toString(value);
		//System.out.println(history);
		return;
	}
	
	/**
	 * This method is used to subtract the parameter from the total value
	 * and update the String containing the history
	 * @param value This is the parameter for subtract method
	 * @return Nothing
	 */
	public void subtract (int value) 
	{
		total = total - value;
		//System.out.println(Integer.toString(total));
		history = history + "-" + Integer.toString(value);
		//System.out.println(history);
		return;
	}
	
	/**
	 * This method is used to return the history of transactions
	 * @return String This method is returning a string
	 */
	public String toString ()
	{
		//System.out.println(history);
		return history;
	}

	/**
	 * This method clears the history and resets the total to 0
	 */
	public void clear()
	{
		total = 0;  // not needed - included for clarity
		history = Integer.toString(total);
	}
}