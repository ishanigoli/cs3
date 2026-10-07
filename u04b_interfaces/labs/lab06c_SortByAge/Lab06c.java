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

public class Lab06c
{
	public static void main ( String[] args ) throws IOException
	{
	   //add test cases
      Scanner file = new Scanner(new File("lab06c.dat"));
      int size = file.nextInt();
      file.nextLine();
      
      ArrayList<Person> list = new ArrayList<Person>();
      for(int i = 0; i < size; i++) {
         int year = file.nextInt();
         int month = file.nextInt();
         int day = file.nextInt();
         String name = file.next();
            
         list.add(new Person(year, month, day, name));
      }
      Collections.sort(list);
      
      for(Person p : list) {
         out.println(p);
      }
      
      
	}
}

