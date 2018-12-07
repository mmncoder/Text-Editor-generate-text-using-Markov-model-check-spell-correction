/**
 * 
 */
package spelling;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;


/**
 * A class that implements the Dictionary interface with a HashSet
 */
public class DictionaryHashSetMatchCase implements Dictionary 
{

    private HashSet<String> words;
	
	public DictionaryHashSetMatchCase()
	{
	    words = new HashSet<String>();
	}
	
    /** Add this word to the dictionary.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
	@Override
	public boolean addWord(String word) 
	{
		return words.add(word);
	}

	/** Return the number of words in the dictionary */
    @Override
	public int size()
	{
    	 return words.size();
	}
	
	/** Is this a word according to this dictionary? */
    @Override
	public boolean isWord(String s) 
    {
    	//if word is in wrong case 

		System.out.println(s + " :" + isOrderlyCapitalized(s));
		//System.out.println();
    	//if(!isOrderlyCapitalized(s)) return false;
    	if(isOrderlyCapitalized(s)) 
    	{
        	return words.contains(s.toLowerCase());

    	}
    	return false;
	}
	private boolean isOrderlyCapitalized(String word)
	{

    	if((Character.isUpperCase(word.charAt(0)) &&(isRestCharIsUpper(word) || isRestCharIsLower(word)))) return true;
    	else if((Character.isLowerCase(word.charAt(0)) && isRestCharIsLower(word))) return true;
    	
		return false;
	}
	private boolean isRestCharIsUpper(String word)
	   {
		   for(int i = 1; i  < word.length(); i++)
		   {
			   if(Character.isLowerCase(word.charAt(i))) return false;
		   }
		   return true;
	   }
	
   private boolean isRestCharIsLower(String word)
   {
	   for(int i = 1; i  < word.length(); i++)
	   {
		   if(Character.isUpperCase(word.charAt(i))) return false;
	   }
	   return true;
   }
}
