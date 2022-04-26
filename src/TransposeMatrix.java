import java.util.Scanner;

public class TransposeMatrix
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int arr[][] = new int[row][column];
        System.out.println("Enter the Element in Matrix :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {

                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("Transpose Matrix :");
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(arr[j][i]+"  ");     // (0,0) , (1,0) --> (0,1) , (1,1)
            }
           System.out.println("");
        }
    }
}
//OUTPUT :
/*
  2
  2
  Enter the Element in Matrix :
  1 2
  3 4
  Original Matrix :
  1  2
  3  4
  Transpose Matrix :
  1  3
  2  4 */