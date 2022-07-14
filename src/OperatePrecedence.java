import java.util.Scanner;

public class OperatePrecedence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int value = findPrecedence(s);
        System.out.println("The Value is : " +value);
    }
    public static int findPrecedence(String s) {
        int n = s.length();
        char[] str = s.toCharArray();
        int lengthValue = 0,operatorLength = 0,result = 0, j = 0,c;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (str[i]>=48 && str[i]<=58) {
                if (operatorLength == 0) {
                    lengthValue++;
                }
                else {
                    j = 1;
                    break;
                }
            }
            else {
                operatorLength++;
            }
        }
        if (lengthValue != operatorLength + 1 || j == 1)
        {
            //wrong input ie 1234*/
            System.out.println("Input wrong");
        }
        else {
            operatorLength = 0;
            result = str[0] - 48;
            for (int i = 1; i < lengthValue; i++) {
                c = str[i] - 48;
                switch (str[lengthValue + operatorLength]) {
                    case '+' -> result = result + c;
                    case '-' -> result = result - c;
                    case '*' -> result = result * c;
                    case '/' -> {
                        if (c == 0) {
                            System.out.println("Abnormal state");
                            flag = false;
                        }
                        result = result / c;
                    }
                }
                if (!flag) {
                    break;
                }
                operatorLength++;
            }
        }
        return result;
    }
}
//OUTPUT :
/*
5742+-*
The Value is : 16

123-/*
Input wrong
The Value is : 0

201/+
Abnormal state

 */