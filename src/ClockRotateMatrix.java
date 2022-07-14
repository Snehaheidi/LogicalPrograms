import java.util.Scanner;

public class ClockRotateMatrix
{
   public static void main(String[] args)
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
      System.out.println(" Rotate Matrix Clockwise ");
      for(int i=0;i<row;i++)
      {
         for(int j=column-1;j>=0;j--)
         {
            System.out.print(arr[j][i]+"\t");
         }
         System.out.println("");
      }
   }
}
//OUTPUT :
/*
row: 3
column: 3
Enter the Element in Matrix :
1 2 3
4 5 6
7 8 9
Original Matrix :
1  2  3
4  5  6
7  8  9
 Rotate Matrix Clockwise
7	4	1
8	5	2
9	6	3
 */