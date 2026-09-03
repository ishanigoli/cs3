//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
		magicSquare = new int[0][0];
	}

	public MagicSquare(int size)
	{
      setSize(size);
	}
	
	public void setSize(int size)
	{
      magicSquare = new int[size][size];
      
	}

	public void createMagic()
	{
		int n = 1;
      int max = magicSquare.length;
		int row = 0;
      int col = max/2;
      magicSquare[row][col] = n;    
      for(int num = 2; num <= max*max; num++) {
         int oldRow = row;
         int oldCol = col;
         row--;
         col++;
         if(row < 0) {
            row=max-1;
         }
         if(col==max) {
            col=0;
         }
         if(magicSquare[row][col] != 0) {
            row = oldRow;
            col = oldCol;
            row++;
            if(row==max) {
               row=0;
            }
         }
         magicSquare[row][col] = num;
      }
	}

	public String toString( )
	{
		String output="";
      for(int r = 0; r < magicSquare.length; r++) {
         for(int c = 0; c < magicSquare[r].length; c++) {
            output+=magicSquare[r][c] + " ";
         }
         output+="\n";
      }
		return output;
	}
}

