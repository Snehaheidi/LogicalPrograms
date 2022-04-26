import java.util.Scanner;

public class ConvertUnbalanced
{
    // Function to return balancedBrackets string
    static String balancedBrackets(String str)
    {
        // Initializing dep to 0
        int dep = 0;
        // Stores maximum negative depth
        int minDep = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(')
                dep++;
            else
                dep--;
            // if dep is less than minDep
            if (minDep > dep)
                minDep = dep;
        }

        // if minDep is less than 0 then there
        // is need to add '(' at the front
        if (minDep < 0)
        {
            for (int i = 0; i < Math.abs(minDep); i++)
                str = '(' + str;
        }

       else
        {
            if (dep != 0)
            {
                for (int i = 0; i < dep; i++)
                    str = str + ')';
            }
        }
        // if dep is not 0 then there
        // is need to add ')' at the back
        return str;
    }
   public static void main(String[] args)
   {
       Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
       System.out.println(balancedBrackets(str));
   }
}
//OUTPUT : ()((
//         ()(())


// Reinitializing to check the updated string
//        dep = 0;
//        for (int i = 0; i < str.length(); i++)
//        {
//            if (str.charAt(i) == '(')
//                dep++;
//            else
//                dep--;
//        }