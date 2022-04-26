import java.util.Scanner;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Row in Matrix :");
        int row = scanner.nextInt();
        System.out.println("Enter the Column in Matrix: ");
        int column = scanner.nextInt();
        int arr1[][]= new int[row][column];
        int arr2[][]= new int[row][column];
        System.out.println("Enter the Matrix 1 :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the Matrix 2 :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr2[i][j] = scanner.nextInt();
            }
        }
        int add[][] = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                add[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of Two Matrices is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(add[i][j] + "     ");
            }
            System.out.println();
        }
    }
}
