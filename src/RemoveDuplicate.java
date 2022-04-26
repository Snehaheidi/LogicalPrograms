import java.util.Scanner;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        // 3 2 1 4 5 4  -----> Remove value 4
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j] = 0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
//        int[] temp = new int[n];
//        int j = 0;
//        for (int i=0; i<n-1; i++){
//            if (arr[i] != arr[i+1]){
//                temp[j++] = arr[i];
//            }
//        }
//        temp[j++] = arr[n-1];
//        //original array
//        for(int i=0;i<j;i++)
//        {
//            System.out.print(temp[i]+" ");
//        }
    }
}
//OUTPUT: 5
//        3 1 2 4 4
//        3 1 2 4 0