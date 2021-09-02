/*
	Given a 9-by-9 array of integers between 1 and 9, write SudokuCheck.java to check if it is a valid solution to a Sudoku puzzle: each row, column, and block should contain the 9 integers exactly once.

	 5 3 4 | 6 7 8 | 9 1 2 
 	 6 7 2 | 1 9 5 | 3 4 8 
	 1 9 8 | 3 4 2 | 5 6 7
	 -------+-------+------ 
 	 8 5 9 | 7 6 1 | 4 2 3 
	 4 2 6 | 8 5 3 | 7 9 1 
	 7 1 3 | 9 2 4 | 8 5 6 
	 -------+-------+------ 
	 9 6 1 | 5 3 7 | 2 8 4 
	 2 8 7 | 4 1 9 | 6 3 5 
	 3 4 5 | 2 8 6 | 1 7 9
	The above Sudoku board can be stored in 2d array as follows:
	int[][] a = {
	{5, 3, 4, 6, 7, 8, 9, 1, 2},
	{6, 7, 2, 1, 9, 5, 3, 4, 8},
	{1, 9, 8, 3, 4, 2, 5, 6, 7},
	{8, 5, 9, 7, 6, 1, 4, 2, 3},
	{4, 2, 6, 8, 5, 3, 7, 9, 1},
	{7, 1, 3, 9, 2, 4, 8, 5, 6},
	{9, 6, 1, 5, 3, 7, 2, 8, 4},
	{2, 8, 7, 4, 1, 9, 6, 3, 5},
	{3, 4, 5, 2, 8, 6, 1, 7, 9} };
*/

public class SudokuCheck
{
    public static String sudokucheck(int[][] a)
    {
        String status = "Valid";

        // for checking rows
        for(int row = 0; row < 9; row++) // It picks up the row number
        {
            for (int col = 0; col < 8; col++) // On the above specified row in an array, it picks up an element
            {
                // Note: Col2 is initalised as 1+col.
                for (int col2 = col + 1; col2 < 9; col2++) // This loop is used to compare entire elements of the row with the element positioned at the
                                                           // value of column which is specified by the 1st inner loop
                {
                    if (a[row][col] == a[row][col2]){ status = "Invalid at rows";// If the value at the specified row and column of an array matches with the
                    return status;}                                           // value at same row but the position specified by variable col2, then stores
                                                                             // the value false in the variable status and return into main program
                }
            }
        }

        // for checking columns
        for(int col = 0; col < 9; col++) // It picks up the column number
        {
            for(int row = 0; row < 8; row++) // On the above specified row in an array, it picks up an element
            {
                // Note: row2 is initalised as 1+col.
                for(int row2 = row + 1; row2 < 9; row2++) // This loop is used to compare entire elements of the column with the element positioned at the
                                                          // value of row which is specified by the 1st inner loop
                {
                    if (a[row][col] == a[row2][col]) {status = "Invalid at column"; // If the value at the specified row and column of an array matches with the
                    return status;}                                           // value at same column and the position specified by variable row2, then store
                                                                     // the value false in the variable status and returns to main program
                }
            }
        }
        /* 
	 for comparison in grid
         Note : '%' gives remainder while '/' gives quotient
         Following code can be understood with an example
         If the grid is
         1 2 3
         4 5 6
         7 8 9
         At first 1 would be compared to 4, 7, 2, 5, 8, 3, 6 and 9,
         Then 4 would be compared in a similar fashion, starting by the comparison with 7 and ending on 9
         Rest of the grid would be compared in the same way

         After the completion of 1 grid program would move to second grid as the 1st inner loop is incrementing columns by three

         After the completion of first three grids by column format, program would increment row by adding 3 and  the whole process mentioned above
         would be carried out
	/*
        // This would carry on until the value of variable 'row' is 9
        for(int row = 0; row < 9; row += 3) // Would be executed thrice
        {
            for(int col = 0; col < 9; col += 3) // Would be executed thrice
            {
                // row, col is start of the 3 by 3 grid
                for(int pos = 0; pos < 8; pos++)
                {
                    for(int pos2 = pos + 1; pos2 < 9; pos2++)
                    {
                        if (a[row + pos % 3][col + pos / 3] == a[row + pos2 % 3][col + pos2 / 3])
                        {
                            status = "Invalid at grids";
                            return status;
                        }
                    }
                }
            }
        }

        return status;
    }

    public static void main(String[] args) {
        int[][] a =
                {
                        {5, 3, 4, 6, 7, 8, 9, 1, 2},
                        {6, 7, 2, 1, 9, 5, 3, 4, 8},
                        {1, 9, 8, 3, 4, 2, 5, 6, 7},
                        {8, 5, 9, 7, 6, 1, 4, 2, 3},
                        {4, 2, 6, 8, 5, 3, 7, 9, 1},
                        {7, 1, 3, 9, 2, 4, 8, 5, 6},
                        {9, 6, 1, 5, 3, 7, 2, 8, 4},
                        {2, 8, 7, 4, 1, 9, 6, 3, 5},
                        {3, 4, 5, 2, 8, 6, 1, 7, 9}
                };
        System.out.print(sudokucheck(a));
    }
}