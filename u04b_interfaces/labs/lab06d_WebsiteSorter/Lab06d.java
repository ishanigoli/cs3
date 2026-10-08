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

public class Lab06d
{
	public static void main ( String[] args ) throws IOException
	{
      Scanner file = new Scanner(new File("lab06d.dat"));
      ArrayList<SiteName> list = new ArrayList<SiteName>();
      if (file.hasNextInt()) {
         int count = file.nextInt();          
         for (int i = 0; i < count; i++) {
         if (file.hasNext()) {
            list.add(new SiteName(file.next()));
            }
         }
          
      Collections.sort(list);
          
      for (SiteName site : list) {
          out.println(site);
      }   
      }

	}
}


