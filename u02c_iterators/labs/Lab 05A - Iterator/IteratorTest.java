import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import static java.lang.System.*;

class IteratorTest {
   public static void populateListFromString(ArrayList<String> list, 
                                                        String strList){
      list.addAll(Arrays.asList(strList.split(" ")));

   }

   public static void addToListFromString(ArrayList<String> list, 
                                                        String strList)   {
      list.addAll(Arrays.asList(strList.split(" ")));
         
   }
   
   /*** REMOVE ***/
   public static void remove(ArrayList<String> list, String toRemove) {
      Iterator<String> it = list.iterator();
      while(it.hasNext()) {
         if(it.next().equals(toRemove)) {
            it.remove();
         }
       }
                               
   }

   /*** REPLACE ***/
   public static void replace(ArrayList<String> list, String toRemove, String replaceWith) {
      ListIterator<String> it = list.listIterator();
      while(it.hasNext()) {
         if(it.next().equals(toRemove)) {
            it.set(replaceWith);
         }
      }
   } 
}