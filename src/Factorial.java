import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial
{
   public static int fact(int number)
   {
       if(number==0)
       {
          return 1;
       }
       else
       {
           return (number * fact(number-1));
       }
   }
    public static void main(String args[])
  {
     int number,result;
     Scanner scanner = new Scanner(System.in);
     try
     {
         System.out.println("Enter the Factorial Number :");
         number = scanner.nextInt();
         result = fact(number);
         System.out.print("The Factorial of "+number+" is : "+result);
     }
     catch (InputMismatchException e)
     {
         System.out.println("Give Number Format Value");
     }
  }
}
