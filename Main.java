class Main {

  // The matrices that are going to be multiplied together.

  public static int[][] matrixA = {
    {1, 2, -2, 0},
    {-3, 4, 7, 2},
    {6, 0, 3, 1}
  };

  public static int[][] matrixB = {
    {-1, 3},
    {0, 9},
    {1, -11},
    {4, -5}
  };

  public static void main(String[] args) {

    // Executes the Mutator and Accessor Methods
    display2DArray(multiply(matrixA, matrixB));

  }

  /** Postcondition 

  returns a 2D array that is the multiplied output of matrices 'a' and 'b'.

  */
  public static int[][] multiply(int[][] a, int[][] b) {
    
    int[][] c = new int[a.length][b[0].length];

    // rows and cols defined as per the 'c' array
    for (int row = 0; row < c.length; row++) {
      for (int col = 0; col < c[row].length; col++) {  
        
        for(int j = 0; j < a[row].length; j++) {
          c[row][col] += a[row][j]*b[j][col];
        }

      } 
    }

    return c;

  }

  public static void display2DArray(int[][] arr) {

    // Loops through each value and prints it.
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        
        System.out.print(arr[row][col] + " ");

      }
      // Creates a new line between rows to make output readable.
      System.out.println(); 
    }

  }

}
