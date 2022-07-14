import java.util.Scanner;

public class MoveZeroEndArray
{
    static void moveZero(int[] arr,int n)
    {
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++] = arr[i];
            }
        }
        while(count<n)
        {
            arr[count++] = 0;
        }
        printArray(arr,n);
    }
    static void printArray(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
  public static void main(String[] args)
  {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the array element");
      for(int i=0;i<n;i++)
      {
          arr[i] = scanner.nextInt();
      }
      moveZero(arr,n);
  }
}
