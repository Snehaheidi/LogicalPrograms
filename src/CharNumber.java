import java.util.Scanner;

public class CharNumber
{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine();
        for(int i =0; i < s.length(); i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                System.out.print(s.charAt(i));
            }
            else{
                int a = s.charAt(i)-48; //Convert to Int --> String Char value is minus 48 because the value give

                for(int j =1; j <a; j++) {
                    System.out.print(s.charAt(i-1));
                }
            }
        }
    }
}
//OUTPUT :
/*    S2N2E2H2A2
      SSNNEEHHAA

      SSNNEEHHAA
      S2N2E2H2A2
      */