import java.util.Scanner;

public class NumberToChar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count[]=new int[256];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i <str.length(); i++)
        {
            if(count[str.charAt(i)]>0)
            {
                System.out.print(str.charAt(i)+""+count[str.charAt(i)]);
                count[str.charAt(i)]=0;
            }
        }
    }
}
