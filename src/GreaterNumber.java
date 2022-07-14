import java.util.Scanner;

public class GreaterNumber
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
        int temp = 0,count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i] < arr[j])
                {
                    if(count==0)
                    {
                        temp = arr[j];
                        count = 1;
                    }
                    else {
                        if (temp > arr[j]) {
                            temp = arr[j];
                        }
                    }
                }
            }
            if(temp==0)
            {
                System.out.print(arr[i]+" < ");
            }
            else
            {
                System.out.print(arr[i]+" < "+temp+",\t");
                count = 0;
                temp = 0;
            }
        }
    }
}
//OUTPUT:
/*
5
1 2 3 4 5
1 < 2,	2 < 3,	3 < 4,	4 < 5,	5 <
 */