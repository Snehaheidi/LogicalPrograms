import java.util.Arrays;
import java.util.Scanner;

public class NumberElement
{
    public static void main(String args[])
    {
        int visited = -1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int freq[] = new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            int count = 1;
          for(int j=i+1;j< arr.length;j++)
          {
              if(arr[i]==arr[j])
              {
                  count++;
                  freq[j] = visited;
              }
          }
            if(freq[i] != visited) // Not visited Count Value Stored
            {
                freq[i] = count;
            }
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=visited)  //Not visited Value print
            {
                System.out.println(arr[i]+" Occurs "+freq[i]);
            }
        }
    }
}
//OUTPUT: 5
//        4 3 2 2 2
//        4 Occurs 1
//        3 Occurs 1
//        2 Occurs 3