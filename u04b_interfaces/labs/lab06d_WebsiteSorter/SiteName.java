//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
//add instance variables
private String name;
private String category;


public SiteName() {
}
public SiteName(String n) {
 name = n;
 int index = name.indexOf(".");
 category = name.substring(index);
}
public int compareTo(SiteName other) {
   int categoryCompare = this.category.compareTo(other.category);
   if(categoryCompare != 0) {
     return categoryCompare;
   }
   return this.name.compareTo(other.name);
 }
public String toString() {
  return name;
}
}
