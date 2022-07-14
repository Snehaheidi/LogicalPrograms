import java.util.Scanner;

public class FirstRepeatChar
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       int count =0 , max = 0;
       char element = 0;
       String str = scanner.nextLine();
       for(int i=0;i<str.length();i++)
       {
           for(int j=i+1;j<str.length();j++)
           {
               if(str.charAt(i)==str.charAt(j))
               {
                   count++;
               }
               element = str.charAt(j);
           }
           if(count > max || element < str.charAt(i) )
           {
               max = count;
               count = 0;
           }
       }
       System.out.println(element);
    }
}
//OUTPUT :
/*
   input  : aaaabbbcccdddd
   output : d
 */