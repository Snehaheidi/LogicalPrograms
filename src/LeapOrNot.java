import java.util.Scanner;

public class LeapOrNot
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println("Leap Year ");
        }
        else
        {
            System.out.println("Not Leap Year ");
        }
    }
}
