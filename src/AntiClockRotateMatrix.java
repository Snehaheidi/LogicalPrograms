import java.util.Scanner;

public class AntiClockRotateMatrix
{
    private static void rotateMatrix(int[][] arr, int row, int column)
    {
        System.out.println("Anti-Clock Rotate Matrix ");
        for(int i=row-1;i>=0;i--)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        System.out.println("Enter the matrix element ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        rotateMatrix(arr,row,column);
    }
}
//OUTPUT :
/*
row : 3
column : 3
Enter the matrix element
1 2 3
4 5 6
7 8 9
 Anti-Clock Rotate Matrix
3	6	9
2	5	8
1	4	7
 */