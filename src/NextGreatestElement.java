import java.util.Scanner;

public class NextGreatestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max_from_right = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2 ; i>=0;i--)
        {
            int temp = arr[i];
            arr[i] = max_from_right;
            if(max_from_right<temp)
            {
                max_from_right = temp;
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
//OUTPUT :
/*
6
16 17 4 3 5 2
17 5 5 5 2 -1
 */