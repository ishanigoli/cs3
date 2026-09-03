//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat=new char[0][0];
	}

   public FancyWord(String word)
	{
      int size = word.length();
      mat = new char[size][size];
      for(int i = 0; i < word.length(); i++) {
         mat[0][i] = word.charAt(i);
         mat[size-1][i] = word.charAt(i);
         mat[i][i] = word.charAt(i);
         mat[size-1-i][i] = word.charAt(i);
      }
	}

	public String toString()
	{
		String output="";
         for(int r=0; r<mat.length; r++) {
            for(int c=0; c<mat[r].length; c++) {
               if(mat[r][c] == '\u0000') {
                  mat[r][c] = ' ';
               }
               output+=mat[r][c]+"";
            }
            output+="\n";
         }
		return output;
	}
}

