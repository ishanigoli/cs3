//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
	}

	public Histogram(char[] values, String fName)
	{
      count = new ArrayList<>();
      letters = new ArrayList<>();
      fileName = fName;
      for(int i = 0; i < values.length; i++) {
         letters.add(values[i]);
         count.add(0);
      }
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
      for(int i = 0; i < count.size(); i++) {
         count.set(i, 0);
      }
      Scanner scan = new Scanner(new File(fileName));
      while(scan.hasNext()) {
         String item = scan.next();
         for(int i = 0; i < item.length(); i++) {
            char let = item.charAt(i);
            int index = letters.indexOf(let);
            if(index != -1) {
               int ct = count.get(index);
               count.set(index, ct + 1);
            }
          }
       }
	}

	public char mostFrequent()
	{
      int max = 0;
      char maxChar = letters.get(0);
      for(int i = 0; i < count.size(); i++) {
         if(count.get(i) > max) {
            max = count.get(i);
            maxChar = letters.get(i);
         }
      }
		return maxChar;
	}

	public char leastFrequent()
	{
      int min = count.get(0);
      char minChar = letters.get(0);
      for(int i = 0; i < count.size(); i++) {
         if(count.get(i) < min) {
            min = count.get(i);
            minChar = letters.get(i);
         }
      }
		return minChar;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
