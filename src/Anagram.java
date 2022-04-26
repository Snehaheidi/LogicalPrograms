import java.util.Arrays;
import java.util.Scanner;

public class Anagram   // What is Anagram --> The given String1 char is must have String2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st String :");
        String str1 = scanner.nextLine();
        System.out.println("Enter the 2nd String :");
        String str2 = scanner.nextLine();
        char[] string1 = str1.toLowerCase().toCharArray();
        char[] string2 = str2.toLowerCase().toCharArray();
        if(string1.length==string2.length)
        {
          for(int i=0;i<string1.length;i++)
          {
              for(int j=i+1;j<string1.length;j++)
              {
                  if(string1[j] < string1[i])
                  {
                      char temp = string1[i];
                      string1[i] = string1[j];
                      string1[j] = temp;
                  }
              }
          }
            for(int i=0;i<string2.length;i++)
            {
                for(int j=i+1;j<string2.length;j++)
                {
                    if(string2[j] < string2[i])
                    {
                        char temp = string2[i];
                        string2[i] = string2[j];
                        string2[j] = temp;
                    }
                }
            }
            if(Arrays.equals(string1,string2))
            {
                System.out.println("Is Anagram ");
            }
            else
            {
                System.out.println("Is not Anagram");
            }
        }
        else
        {
            System.out.println("Is Not Anagram");
        }
    }
}