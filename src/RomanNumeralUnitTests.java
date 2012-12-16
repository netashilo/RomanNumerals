import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests 
{

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void test() 
	{
		assertEquals("MCCCLXXVII", number.toRoman(1378));
	}
}
