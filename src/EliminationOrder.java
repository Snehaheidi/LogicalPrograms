import java.util.ArrayList;
import java.util.Scanner;

public class EliminationOrder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
           arr.add(i,i+1);
//           System.out.println(arr);
        }
         findValue(arr,X,N);
    }
    public static void findValue(ArrayList arr, int X, int N) {
        boolean flag = true;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            flag = true;
            while (flag)
            {
                answer.add((Integer) arr.remove(X - 1));
                System.out.println(answer);
                flag = false;
            }
            ArrayList<Integer> temp = new ArrayList<>();
            for (int t = 0; t < X; t++) {
                temp.add(i,(Integer) arr.get(t));
//                System.out.println(temp);
            }
            int k = 0;
            for (int j = X; j < arr.size(); j++) {
                arr.set(k, j);
//                System.out.println(arr);
                k++;
            }
            for (int s = 0; s < X; s++) {
                arr.set(s + arr.size() - X, temp.get(s));
//                System.out.println(arr);
            }
//            for (int z = 0; z < arr.size(); z++) {
//                System.out.println(arr.get(z));
//            }
        }
     }
}

//                temp[i] = (int) arr[i];
//                arr[k] = arr[j];
//                result[s + result.length - X] = temp[s];