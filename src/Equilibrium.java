import java.util.Scanner;

public class Equilibrium
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i] = scanner.nextInt();
       }
        System.out.println(EquilibriumFind(arr,n));
    }

    private static int EquilibriumFind(int[] arr, int n)
    {
        int rightsum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftSum

        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
        {
            rightsum += arr[i];
        }
        for (int i = 0; i < n; ++i) {
            rightsum -= arr[i]; // sum is now right sum for index i

            if (leftsum == rightsum)
                return i;  //--> index return - return i , position return - return i+1

            leftsum += arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }
}
//OUTPUT :
/*
 Equilibrium
 7
 -7 1 5 2 -4 3 0
 3
------------------------
 6
 1 2 6 4 0 -1
 2

 */