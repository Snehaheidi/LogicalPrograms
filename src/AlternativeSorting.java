import java.util.Scanner;

public class AlternativeSorting
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the Array Element :");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j] < arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAlternative Sorting :"); // 1 2 3 4 5

        int i = 0, j = n-1;
        while (i < j) {
            System.out.print(arr[j--] + " "); // 5  - 4
            System.out.print(arr[i++] + " "); // 1  - 2
        }
        // If the total element in array is odd
        // then print the last middle element.
        if (n % 2 != 0) // 3
            System.out.print(arr[i]);
    }
}
//OUTPUT :
/*5
Enter the Array Element :
5 4 3 2 1
Sorted Array:
1 2 3 4 5
Alternative Sorting :
5 1 4 2 3*/