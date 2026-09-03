//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{
	}

	public PascalsTriangle(int size)
	{
      mat = new int[size][size];
	}

	public void createTriangle()
	{
     for(int r=0; r<mat.length; r++) {
      for(int c=0; c<=r; c++) {
         if(r==0 || c==0) {
            mat[r][c] = 1;
         }
         else {
            mat[r][c] = mat[r-1][c] + mat[r-1][c-1];
         }
      }
      }
	}

	public String toString()
	{
		String output="";
      for(int row = 0; row < mat.length; row++) {
         for(int col = 0; col < mat[row].length; col++) {
            if(mat[row][col] == 0) {
               output+= " ";
            }
            else {
               output+= mat[row][col] + " ";
           }
         }
         output+="\n";
      }
		return output;
	}
}

