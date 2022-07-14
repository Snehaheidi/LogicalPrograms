import java.util.Scanner;

public class SecondFreqElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int first = 0, second = 0;
        for (int i = 0; i < 256; i++) {
            /* If current element is smaller than
            first then update both first and second */
            if (count[i] > count[first]) {  // count[] --> 1 1 2 3 1
                second = first;
                first = i;
            }

            /* If count[i] is in between first and
            second then update second  */
            else if (count[i] > count[second] && count[i] != count[first])
                second = i;
        }
        System.out.println(second);
        System.out.println(first);
    }
}
//OUTPUT :
/*
SecondFreqElement
8
4 6 7 7 8 8 8 5
7
 */