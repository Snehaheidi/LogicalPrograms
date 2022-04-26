import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String reverse = "";
        for(int i=str1.length()-1;i>=0;i--)
        {
           reverse = reverse + str1.charAt(i);
        }
        if(str1.equals(reverse))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
