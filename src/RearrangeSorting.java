import java.util.Scanner;

public class RearrangeSorting
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
        int[] index = new int[n];
        for(int i=0;i<n;i++)
        {
            index[i] = scanner.nextInt();
        }
        reArrange(arr,n,index);
    }
    public static void reArrange(int[] arr,int n,int[] index)
    {
        int answer[] = new int[n];
        for(int i=0;i<n;i++)
        {
          answer[index[i]] = arr[i];
        }
        findResult(answer);
    }

    private static void findResult(int[] answer)
    {
        for(int i=0;i< answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
}

//OUTPUT :
/*
5
array value : 1 2 3 4 5
index : 4 2 0 1 3
Result : 3 4 2 5 1

 */