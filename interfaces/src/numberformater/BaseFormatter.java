package numberformater;

import java.util.HashMap;

/*
This class tact extends NumberFormatter converts any number to any base from 2 to 36 inclusively.
 */

public class BaseFormatter implements NumberFormatter
{
    private int base;

    /**
     * This is the contractor that accepts a base parameter.
     * @param N The base that the number wil be converted to.
     */
    public BaseFormatter(int N)
    {
        this.base = N;
    }

    /**
     * This finds the string or character value of a int like 10 would become a and 12 would become c.
     * @param number the number being converted to its respective character / string.
     * @return the character or string that corresponds to the Integer number.
     */
    private String findNumberValue(int number)
    {
        String output = "";
        HashMap<Integer, Character> numberToChar = new HashMap<>();
        numberToChar.put(10, 'a');
        numberToChar.put(11, 'b');
        numberToChar.put(12, 'c');
        numberToChar.put(13, 'd');
        numberToChar.put(14, 'e');
        numberToChar.put(15, 'f');
        numberToChar.put(16, 'g');
        numberToChar.put(17, 'h');
        numberToChar.put(18, 'i');
        numberToChar.put(19, 'j');
        numberToChar.put(20, 'k');
        numberToChar.put(21, 'l');
        numberToChar.put(22, 'm');
        numberToChar.put(23, 'n');
        numberToChar.put(24, 'o');
        numberToChar.put(25, 'p');
        numberToChar.put(26, 'q');
        numberToChar.put(27, 'r');
        numberToChar.put(28, 's');
        numberToChar.put(29, 't');
        numberToChar.put(30, 'u');
        numberToChar.put(31, 'v');
        numberToChar.put(32, 'w');
        numberToChar.put(33, 'x');
        numberToChar.put(34, 'y');
        numberToChar.put(35, 'z');

        if(number <= 9 && number >= 0)
        {
            output = number+"";
        }else if(number >= 10 && number < 36)
        {
            output = numberToChar.get(number) +"";
        }
        return output;
    }

    /**
     * This method find the size in digits of the would be converted number.
     * @param number the number that will be converted.
     * @return the number of digits of the converted number.
     */
    private int maxNumberOfPlaces(int number)
    {
        int startBase = this.base;
        int largeness = 0;
        boolean isFound = false;
        for(; !isFound; largeness++)
        {
            startBase = (int) Math.pow(base, largeness);
            if(startBase > number)
            {
                break;
            }else if(startBase == number)
            {
                largeness++;
                break;
            }
        }
        return largeness;
    }

    /**
     * This will convert the number n to its respective base.
     * @param n the number being changed or converted.
     * @return the converted number as a string.
     */
    @Override
    public String format(int n)
    {
        int largeness;
        int insertNumber = 0;
        int newN = (int) Math.abs(n);;
        String output = "";
        if(n < 0)
        {
            output = output + "-";
        }
        largeness = maxNumberOfPlaces(newN);


        // finds the maximum number of numbers in the new base format.

        for(int j = 1; j <= largeness; j++)
        {
            insertNumber = 0;
            for(int i = 0; i <= base; i++)
            {
                if(newN < (int) Math.pow(base, largeness - j))
                {
                    if(insertNumber >= 10)
                    {
                        output = output + findNumberValue(insertNumber);
                    }else
                    {

                        output = output + insertNumber;
                    }
                    break;
                } else
                {
                    newN = newN - (int) Math.pow(base, largeness - j);
                    insertNumber++;
                }

            }
        }
        if(output.equals(""))
        {
            output = "0";
        }
        return output;
    }
}
