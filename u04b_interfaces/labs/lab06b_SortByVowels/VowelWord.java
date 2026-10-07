//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class VowelWord implements Comparable<VowelWord>
{
	//add a string instance variable
   private String w;
   
   public VowelWord() {
   }
   
   public VowelWord(String word) {
      w = word;
   }
	
	//add a constructor

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
      for(int i = 0; i < w.length(); i++) {
         if(vowels.indexOf(w.charAt(i)) != -1) {
            vowelCount++;
         }
      }
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
      if(this.numVowels() > other.numVowels()) {
         return 1;
      }
      if(this.numVowels() < other.numVowels()) {
         return -1;
      }
      return this.w.compareTo(other.w);
	}

	public String toString()
	{
		return w;
	}
}

