import java.util.Scanner;

public class Grading_student {

	public static void main(String[] args) {

		// STUDENT GRADING - HACKER RANK - 11
		int n=0;
		int multiple_value = 0;
		int difference = 0;
		int i=0;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = scanner.nextInt();
			if(a[i] >= 38)
			{
				multiple_value = 5 *(a[i]/5+1);
				difference = multiple_value - a[i];
				if(difference < 3 )
				{
					a[i] = multiple_value;
				}
				System.out.println(a[i] + " ");
			}
			else
			{
				System.out.println(a[i] + " ");
			}	
		}
	}
}
