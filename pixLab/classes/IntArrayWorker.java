public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
  public int getCount(int num)
  {
	  int count = 0;
	  for (int row = 0; row < matrix.length; row++)
	  {
		  for (int col = 0; col < matrix[0].length; col++)
		  {
	    	  if (matrix[row][col] == num) {
	    		  count++;
	    	  }
	      }
	  }
	  return count;
  }

  public int getLargest()
  {
	  int largest = matrix[0][0];
	  for (int row = 0; row < matrix.length; row++)
	  {
		  for (int col = 0; col < matrix[0].length; col++)
		  {
	    	  if (matrix[row][col] > largest) {
	    		  largest = matrix[row][col];
	    	  }
	      }
	  }
	  return largest;
  }
  
  public int getColTotal(int col)
  {
	  int total = 0;
	  if (col < 0) {
		  return total;
	  }
	  for (int row = 0; row < matrix.length; row++)
	  {
		  if (col < matrix[row].length) {
			  total += matrix[row][col];
		  }
	  }
	  return total;
  }
}