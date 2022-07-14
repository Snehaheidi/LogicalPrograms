import java.util.Scanner;

public class AdjacentCell
{
    private static void modifyMatrix(int[][] matrix, int R, int C)
    {
        int[] row = new int[R];
        int[] column = new int[C];
        for(int i=0;i< row.length;i++)
        {
            row[i] = 0;
        }
        for(int i=0;i< column.length;i++)
        {
            column[i] = 0;
        }
        for (int i = 0; i < R; i++)
        {
            for (int j = 0; j < C; j++)
            {
                if (matrix[i][j] == 1)
                {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        /* Modify the input matrix mat[] using the
        above constructed row[] and column[] arrays */
        for (int i = 0; i < R; i++)
        {
            for (int j = 0; j < C; j++)
            {
                if ( row[i] == 1 || column[j] == 1 )
                {
                    matrix[i][j] = 1;
                }
            }
        }
    }
    private static void printMatrix(int[][] matrix, int R, int C)
    {
        int i, j;
        for (i = 0; i < R; i++)
        {
            for (j = 0; j < C; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int matrix[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        modifyMatrix(matrix, row, column);
        System.out.println("Matrix after modification n");
        printMatrix(matrix, row, column);
    }
}
//OUTPUT :
/*
row : 3
column : 3
Enter the element
1 0 0
0 0 0
0 0 1
Matrix after modification n
1 1 1
1 0 1
1 1 1
 */
