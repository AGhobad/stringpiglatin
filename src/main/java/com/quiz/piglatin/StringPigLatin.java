


package com.quiz.piglatin;



/**
* StringPigLatin
* 
* <P> Given an string, this program converts it to the Pig Latin.
* <p>
* Pig Latin translation is simply taking the first letter of a "word" and appending that letter to the end of the word with "ay" added to the end as well.  Example:
*
* "Alex, how did you do question 21?"  should translate to "lexAay, owhay idday ouyay oday uestionqay 21?"
*  
*  
* @author Ali Ghobadpour
* @version 0.1
*/

public  class StringPigLatin
{

    /* 
       We assume that:       
       1- There is only one Punctuation at the end of a word, e.g "How are you?" or "This is mine." and not "How are you?!".
    */
    
    private static final String punctutations = ".,!?'";

/**
 * <p>
 * Given an String, this method determines if it is a number or not
 * <p>
 * @param  s  an input String
 * @param  num an integer to find all multiples of m when those multiples are smaller than num.
 * @return      boolean: true if 's' is a number, false otherwize.
 */
    private static boolean isNumber(String s)
    {
	try
	    {
		new Double (s);
		return true;
	    }
	catch (Exception e)
	    {
		return false;
	    }
    }
		

/**
 * <p>
 * Given an char, this method determines if that char is a punctuation.
 * <p>
 * @param c  A char
 * @return     boolean: true if c is punctuation, false otherwise
 */

    private static boolean isPunctuation(char c)
    {
	if ( (c < 'A' ||  c > 'Z') &&  ( c < 'a' || c >'z'))
		return true;
	return false;
    }

/**
 * <p>
 * Given an String, this method calculates and returns its Pig Latin version.
 * <p> Assumption:
 *     We are assuming that punctuations  are  not attached to the previous or next word (e.g "How are you ?" or "This is mine . ").
  * @param input: input String
 * @return      Lig Latin version
 */
    public static String stringPigLatin(String input)
    {	
	StringBuffer output = new StringBuffer ();
	String delims = "[ ]+";
	String[] tokens = input.split(delims);
	int size = tokens.length;
	
	for (int i= 0; i < size ; i++)
	    {
		String w = tokens[i];
		int l = tokens[i].length();

		if ((l == 1 && isPunctuation(w.charAt(0)))
		    || isNumber(w))
		    output.append(w).append(" ");
		else
		    {
			if (isPunctuation(w.charAt(l -1)))
			    {
				output.append(w.substring(1,l -1 ) ).append(w.charAt(0)).append("ay").append(w.charAt(l -1)).append(" ");
			    }
			else
			    {
				output.append(w.substring(1)).append(w.charAt(0)).append("ay ");
			    }
		    }
	    }
	return output.toString();
    }


/**
 * <p>
 * Calls stringPigLatin for a given parameter 
 *
 * @param  args  an String array
 */
    public static void main(String[] args) 
    {
	if (args.length == 0)
	    {
		System.err.println(" An String input is required.");
		System.exit (1);
	    }

	System.out.println(stringPigLatin(args[0]));
	
    }
}


