import java.util.Scanner;

public class FirstOccurrence
{
    public static void main(String args[])
    {
        int MAX= 256;
        int[] count1 = new int[MAX];
        int[] count2 = new int[MAX];
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        for(int i=0;i<str2.length();i++)
        {
            (count1[str1.charAt(i)])++;
            (count2[str2.charAt(i)])++;
        }
    }
}
