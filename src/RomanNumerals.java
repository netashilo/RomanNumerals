
public class RomanNumerals 
{

	private final String[] RCODE = {"M", "CM", "D", "CD", "C", "XC", "L",
									   "XL", "X", "IX", "V", "IV", "I"};
	private final int[] 	  BVAL  = {1000, 900, 500, 400, 100, 90, 50,
									   40,   10,   9,    5,   4,    1};
	
	public String toRoman(int num)
	{
		if(num <= 0 || num > 3000)
			throw new NumberFormatException("Value outside roman numeral range.");
	
		String roman = "";
		
		for(int i=0; i < RCODE.length; i++)
		{
			while(num >= BVAL[i])
			{
				num -= BVAL[i];
				roman += RCODE[i];
			}
		}
		return roman;
	}
}
