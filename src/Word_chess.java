import java.util.Scanner;

public class Word_chess {

	public static void main(String[] args) {
		// WORLD CHESS 
		int t;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		for(int i=0;i<t;i++)
		{
			int x;
			x = scanner.nextInt();
			int n=0,c=0,d=0;
			char s[] = new char[14];
			s = scanner.next().toCharArray();  
			for(int j=0;j<s.length;j++)
			{ 
				if(s[j]=='C')
					c++;
				else if(s[j]=='N')
					n++;
				else
					d++;
			}
			if(c>n)
				System.out.println(60*x);
			else if(c<n)
				System.out.println(40*x);
			else
				System.out.println(55*x);
		}
		scanner.close();
	}
}
