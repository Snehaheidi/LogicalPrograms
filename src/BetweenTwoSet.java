import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSet
{
    public static void main(String args[])
    {
        Scanner scanner  = new Scanner(System.in);
        int cnt = 0;
        List<Integer> a =new LinkedList<>();
        System.out.println("Enter the 1st List");
        for(int i=0;i<2;i++)
        {
            a.add(scanner.nextInt()); // 2 , 4
        }
        List<Integer> b = new LinkedList<>();
        System.out.println("Enter the 2nd List");
        for(int i=0;i<2;i++)
        {
            b.add(scanner.nextInt());   // 24 , 36
        }
        for (int i = 1; i < 100; i++)
        {
            boolean result = true;
            for (int j = 0; j < a.size() && result; j++)
            {
                if (i % a.get(j) != 0)
                    result = false;
            }
            for (int j = 0; j < b.size() && result; j++)
            {
                if (b.get(j) % i != 0)
                {
                    result = false;
                }
            }
            if (result == true)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

//OUTPUT:
/*
First condition (multiple of each element of array 'a')
2 * 3 = 6
6 * 1 = 6
2 * 3 = 12
6 * 2 = 12

Second condition (factor of each element of array 'b')
24 % 6 = 0
24 % 12 = 0
36 % 6 = 0
36 % 12 = 0

//OUTPUT : 2

 */
