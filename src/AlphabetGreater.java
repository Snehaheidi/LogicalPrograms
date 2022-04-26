import java.util.Scanner;

public class AlphabetGreater
{
    private static int alphaGreat(String str)
    {
        int max = 0,result = 0;
        char element = 0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    max++;
                }
                element = str.charAt(j);
            }
            if(max > result || element < str.charAt(i))
            {
                result = max;
                max = 0;
            }
        }
        System.out.println("Character : "+element);
        return result;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Maximum Duplicate : "+alphaGreat(str));
    }
}
