package spelling;

import java.util.TreeSet;

/**
 * @author UC San Diego Intermediate MOOC team
 *
 */
public class DictionaryBST implements Dictionary 
{
   private TreeSet<String> dict;
	
    // TODO: Implement the dictionary interface using a TreeSet.  
 	// You'll need a constructor here
	public DictionaryBST()
	{
		dict = new TreeSet<>();
	}
    
    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	word = word.toLowerCase();
//    	if(!dict.contains(word))
//    	{
//        	dict.add(word);
//        	return true;
//    	}	
//    	return false;
    	dict.add(word);
    	return true;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
         return dict.size();
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) 
    {
    	s = s.toLowerCase();
    	
    	for(String w : dict)
    		if(w.equals(s)) return true;
    	
    	return false;
    }

}
