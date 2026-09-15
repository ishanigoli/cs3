//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class ListIteratorTest
{
	private ArrayList<String> list;

	public ListIteratorTest(String line) {
      setTest(line);
	}

	public void setTest(String line) {
      list = new ArrayList<String>();
      list.addAll(Arrays.asList(line.split(" ")));
	}

	public void replace(String toRemove, String replaceWith) {
      ListIterator<String> it = list.listIterator();
      while(it.hasNext()) {
         if(it.next().equals(toRemove)) {
            it.set(replaceWith);
         }
      }
	}

	public String toString() {
		return list;
	}
}
