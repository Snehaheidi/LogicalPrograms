import java.util.Scanner;

public class ReverseSpclCharAvoid
{
    public static void reverse(char str[])
    {
        int end = str.length - 1, start = 0;
        // Traverse string from both ends until 'start' and 'end'
        while (start < end) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[start]))
                start++;
            else if (!Character.isAlphabetic(str[end]))
                end--;

                // Both str[start] and str[r] are not spacial
            else {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
            //System.out.println(str[start]+" "+str[end]);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        System.out.println("Input string : " + str);
        // call static method
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string : " + revStr);
    }
}

