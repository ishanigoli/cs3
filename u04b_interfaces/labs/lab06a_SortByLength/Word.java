//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
   private String w; 
   private int length;
	//add an instance variable and a constructor
   public Word() {
   }
   
   public Word(String word) {
      w = word;
      length = word.length();
   }
   public int compareTo(Word other) {
      if(this.length > other.length) {
         return 1;
      }
      else if(this.length < other.length) {
         return -1;
      }
      else {
         return this.w.compareTo(other.w);
      }
      
   }
	//add a compareTo
   public String toString() {
      return w;
   }
	//add a toString
}

