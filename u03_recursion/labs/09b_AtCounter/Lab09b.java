//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09b
{
	public static void main(String args[])
	{
		AtCounter test = new AtCounter();
      test.countAts(0,0);
      out.println("" + 0 + " " + 0 + " has " + test);
      
      AtCounter test1 = new AtCounter();
      test1.countAts(2,5);
      out.println("" + 2 + " " + 5 + " has " + test1);
      
      AtCounter test2 = new AtCounter();
      test2.countAts(5,0);
      out.println("" + 5 + " " + 0 + " has " + test2);
      //add test cases		
	}
}

