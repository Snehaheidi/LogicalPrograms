import java.util.Arrays;
import java.util.Scanner;

public class AlreadyStringPresent
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        char[] arr = str1.toCharArray();
        for(int i = 0; i<str1.length(); i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    arr[i] = 0;
                }
            }
        }
        System.out.println("Remove Duplicate Char");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]);
            }
        }
    }
}
//OUTPUT :
/*
sneha
heidi
***Remove Duplicate Char***
sna
 */
