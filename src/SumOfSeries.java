import java.util.Scanner;

public class SumOfSeries
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter N value :");
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum = sum + i ; // sum = 1+2+3+4+...+n;
        }
        System.out.println("Sum of Series :" +sum);
    }
}
// for(int i=1;i<=num;i++)
// {
//    sum = sum + i * i; // sum = 1^1 + 2^2 + 3^3 + 4^4  +...+n;
// }
