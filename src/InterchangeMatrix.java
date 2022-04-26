import java.util.Scanner;

public class InterchangeMatrix
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Row in Matrix :");
        int row = scanner.nextInt();
        System.out.println("Enter the Column in Matrix: ");
        int column = scanner.nextInt();
        int arr[][] = new int[row][column];
        if(row==column) {
            System.out.println("Enter the Matrix :");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    arr[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Original Matrix :");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    System.out.print(arr[i][j] + "    ");
                }
                System.out.println(" ");
            }
            for (int j = 0; j < column; j++)
            {
                int temp = arr[j][j];
                arr[j][j] = arr[j][column - 1 - j];
                arr[j][column - 1 - j] = temp;
            }
            System.out.println(" ");
            System.out.println("After interchanging diagonals of Matrix ");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    System.out.print(arr[i][j] + "   ");
                }
                System.out.println(" ");
            }
        }
        else
        {
            System.out.println("** Row & Column is Not Equal **");
        }
    }
}