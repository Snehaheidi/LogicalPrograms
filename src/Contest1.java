package contest1;

import java.util.Scanner;
public class Contest1 {
	public static void main(String[] args) {
		//FRUITS APPLE & BANANA - CODE CHEFF
		int banana = 0,apple = 0;
		Scanner scanner=new Scanner(System.in);
		int	a=scanner.nextInt();
		for(int i=0;i<a;i++){
			banana=scanner.nextInt();
			apple=scanner.nextInt();
			int result = 0;
			while(banana>1 && apple>0)
			{
				result++;
				banana=banana-2;
				apple--;	
			}
			System.out.println(result);
		}
		scanner.close();
	}
}
