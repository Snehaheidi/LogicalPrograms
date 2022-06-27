import java.util.Scanner;

public class Fit_Datatype {

	public static void main(String[] args) {
		int T;
		int n , x;
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		for(int i=0;i<=T;i++)
		{
			n = scanner.nextInt();
			x = scanner.nextInt();

			if(x>=0 && x<=n)
			{
				System.out.print(x);
			}
			else if(x>n)
			{
				x = x-(n+1);
				System.out.print(x);
			}
		}
		scanner.close();
	}
}