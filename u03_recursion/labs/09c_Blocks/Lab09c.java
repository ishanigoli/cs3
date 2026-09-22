//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab09c
{
	public static void main( String args[] ) throws IOException
	{
      String values[] = {"A","E","I","O","U"};
      Grid test = new Grid(12, 12, values);
      out.println(test + "A count == " + test.findMax("A"));
	}
}

