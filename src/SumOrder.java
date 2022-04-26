import java.util.Scanner;

public class SumOrder
{
    public static void main(String args[])
    {
        int result;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.print("The Sum Value N = ");
        int N = scanner.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                result = arr[i]+arr[j];
                if(result==N)
                {
                    System.out.print("{"+arr[i]+","+arr[j]+"}");
                }
            }
            if(arr[i]==N)
            {
                System.out.print(" {"+arr[i]+"}");
            }
        }
    }
}
