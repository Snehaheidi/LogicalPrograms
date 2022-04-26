import java.util.Scanner;

public class ArraySum
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st Array Size :");
        int n = scanner.nextInt();
        System.out.println("Enter the 2nd Array Size :");
        int n1 = scanner.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n1];
        System.out.println("Enter the 1st Array Element :");
        for(int i=0;i<n;i++)
        {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the 2nd Array Element :");
        for(int i=0;i<n1;i++)
        {
            arr2[i] = scanner.nextInt();
        }
        int result[] = new int[n > n1 ? n : n1];
        int i = n-1,j = n1-1;
        int k = result.length-1;
        int c =0;
        System.out.println("Sum Two Array :");
       while(i>=0 || j>=0)
       {
           while (i >= 0 || j >= 0)
           {
               int d = c;
               if (i >= 0)
                   d += arr1[i];

               if (j >= 0)
                   d += arr2[j];

               c = d / 10;
               d = d % 10;
               result[k] = d;

               i--;
               j--;
               k--;
           }
           if (c > 0) {
               System.out.print(c);
           }
           for (int val : result) {
               System.out.print(val);
           }
       }
    }
}
