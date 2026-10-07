//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06b
{
	public static void main( String args[] ) throws IOException
	{
		
      String data = "freddy at elephant whoooooodat alice tommy bobby it at about b";
      Scanner scan = new Scanner(data);
      
      ArrayList<VowelWord> words = new ArrayList<VowelWord>();
      while (scan.hasNext()) {
         String wordStr = scan.next();
         words.add(new VowelWord(wordStr));
      }
  
      Collections.sort(words);


      for (VowelWord word : words) {
         out.println(word + " ");
      }


      //add test cases		
	}
}

