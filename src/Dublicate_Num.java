import java.util.Scanner;

public class Dublicate_Num {

	public static void main(String[] args) {
        int n,sum =0 ;
        int missnumber, result = 0;;
        Scanner scanner=new Scanner(System.in);
        n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
        	a[i] = scanner.nextInt();
        }
         sum = (n*(n+1))/2; // Total number  
        for(int j=0;j<n-1;j++)
        {
        	result = result + a[j];
        }
        missnumber = sum - result;  // Total number - given input number
        System.out.println("The Missing Number is = "+missnumber);
        scanner.close();
	}
}
