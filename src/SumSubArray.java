import java.util.Scanner;

public class SumSubArray
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int max = 0,sum = 0;
        System.out.println("Enter the Array Size :");
        int n = scanner.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the Array Element :");
        for(int i=0;i<num.length;i++)
        {
            num[i] = scanner.nextInt();
        }
        for(int j=0;j<num.length;j++)
        {
            if(num[j]>max)
            {
                max = num[j]; //Max value 1st time
            }
        }
        for(int j=0;j<num.length;j++)
        {
          if(num[j]+sum<0) // value 0 under --> again sum = 0
          {
             sum = 0;
             continue;
          }
          else
          {
              sum +=num[j];
              System.out.print(num[j]+" ");
              if(sum>max)
              {
                  max = sum;
              }
          }
        }
        System.out.println("");
        System.out.println(max);
    }
}
/*
Enter the Array Size :
4
Enter the Array Element :
-1 -2 3 4
3 4
7
 */