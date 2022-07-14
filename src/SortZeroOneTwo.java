import java.util.Scanner;

public class SortZeroOneTwo
{
        public static void sortColors(int[] nums ,int n)
        {
            int cnt0 = 0 , cnt1 = 0, cnt2 = 0;
            for(int i=0;i<n;i++)
            {
                switch (nums[i]) {
                    case 0:
                        cnt0++;
                        break;
                    case 1:
                        cnt1++;
                        break;
                    case 2:
                        cnt2++;
                        break;
                }
            }
            int i = 0;
            while (cnt0 > 0) {
                nums[i++] = 0;
                cnt0--;
            }
            while (cnt1 > 0) {
                nums[i++] = 1;
                cnt1--;
            }
            while (cnt2 > 0) {
                nums[i++] = 2;
                cnt2--;
            }
            for(int s=0;s<n;s++)
            {
                System.out.print(nums[s]+" ");
            }
        }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = scanner.nextInt();
        }
        sortColors(nums,n);
    }
}
