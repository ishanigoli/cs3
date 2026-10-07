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

public class Lab06a
{
	public static void main( String args[] ) throws IOException
	{
      String data = "freddy at elephant whoooooodat alice tommy bobby it at about";
      Scanner file = new Scanner(data);


      ArrayList<Word> words = new ArrayList<Word>();
      while (file.hasNext()) {
         String wordStr = file.next();
         words.add(new Word(wordStr));
      }
  
      Collections.sort(words);


      for (Word word : words) {
         out.println(word + " ");
      }
	}
}

