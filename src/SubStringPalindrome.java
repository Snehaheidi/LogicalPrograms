import java.util.Scanner;
public class SubStringPalindrome
{
    public static boolean isPalindrome(String str){
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }
        return false;
    }

    public static void check(String str){
        String rString ="";
        int max =0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=str.length()-1;j>i;j--)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    if(isPalindrome(str.substring(i, j+1)))
                    {
                        if(str.substring(i, j+1).length()>max)
                        {
                            rString= str.substring(i, j+1);
                            max=rString.length();
                        }
                    }
                }
            }
        }
        if(rString.isEmpty()){
            System.out.println("none");
        }
        else
        {
            System.out.println(max);
            System.out.println(rString);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string :");
        String str = scanner.next();
        check(str);
        scanner.close();
    }
}
/*
 OUTPUT:
  Enter string :
    himalayalam
    9
    malayalam

 */