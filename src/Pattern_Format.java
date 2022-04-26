import java.util.Scanner;

public class Pattern_Format
{
    int MAX = 256;
    public void Pattern()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Text Character :");
        String text = scanner.nextLine();
        System.out.print("Enter the Pattern Character :");
        String pattern = scanner.nextLine();
        find(pattern,text);
    }
    public void find(String pattern,String text)
    {
        int M = pattern.length();
        int N = text.length();
        char[] countP = new char[MAX];
        char[] countT = new char[MAX];
        for(int i=0;i<M;i++)
        {
            (countP[pattern.charAt(i)])++;
            (countT[text.charAt(i)])++;
        }
        for(int i=M;i<N;i++)
        {
            if(compare(countP,countT))
            {
                System.out.println("Found the Index : "+(i-M));
            }
            (countT[text.charAt(i)])++;
            (countT[text.charAt(i-M)])--;
        }
        if(compare(countP,countT))
        {
            System.out.println("Found the Index : "+(N-M));
        }
    }
    public boolean compare(char[] text, char[] pat)
    {
          for(int k=0;k<MAX;k++)
          {
              if(text[k]!=pat[k])
              {
                  return false;
              }
          }
        return true;
    }
}
