import java.util.Scanner;
public class SpiralMatrix
{
    static void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
/* k - starting row index 
m - ending row index 
l - starting column index 
n - ending column index 
i - iterator 
*/
        while (k < m && l < n)
        {
//prints the first row from the remaining rows  
            for (i = l; i < n; ++i)
            {
                System.out.print(a[k][i] + " ");
            }
            k++;

//prints the last column from the remaining columns  
            for (i = k; i < m; ++i)
            {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
//prints the last row from the remaining rows   
            if (k < m)
            {
                for (i = n - 1; i >= l; --i)
                {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
//prints the first column from the remaining columns  
            if (l < n)
            {
                for (i = m - 1; i >= k; --i)
                {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
       int row = scanner.nextInt();
       int col = scanner.nextInt();
       int[][] arr = new int[row][col];
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               arr[i][j] = scanner.nextInt();
           }
       }
        spiralPrint(row, col, arr);
    }
}
//OUTPUT:
/*
SpiralMatrix
3
3

1 2 3
4 5 6
7 8 9

1 2 3 6 9 8 7 4 5
 */