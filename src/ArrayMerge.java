import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMerge
{
        public static void merge(int arr1[], int arr2[], int array1Size, int array2Size, ArrayList<Integer> result)
        {
            for(int i=0;i<array1Size;i++)
            {
                if(!result.contains(arr1[i]))
                {
                    result.add(arr1[i]);
                }
            }
            for(int i=0;i<array2Size;i++)
            {
                if(!result.contains(arr2[i]))
                {
                    result.add(arr2[i]);
                }
            }
//		Collections.sort(result);
//		result.toString();
//		System.out.println("The Sorted List "+result);
        }
        public static void sort(ArrayList<Integer> result)
        {
            int temp;
            for(int i=0;i<result.size();i++)
            {
                for(int j=i+1;j<result.size();j++)
                {
                    if(result.get(i)>result.get(j))
                    {
                        temp=result.get(i);
                        result.set(i, result.get(j));
                        result.set(j, temp);
                    }
                }
            }
            System.out.println("The sorted Merged Array : "+result);
        }
        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            int array1Size,array2Size;
            System.out.println("Enter Array1 Size : ");
            array1Size=scanner.nextInt();
            int arr1[]=new int[array1Size];
            System.out.println("Enter Array2 Size : ");
            array2Size=scanner.nextInt();
            int arr2[]=new int[array2Size];
            System.out.println("Enter Array1 Elements : ");
            for(int i=0;i<arr1.length;i++)
            {
                arr1[i]=scanner.nextInt();
            }
            System.out.println("Enter Array2 Elements : ");
            for(int i=0;i<arr2.length;i++)
            {
                arr2[i]=scanner.nextInt();
            }
            ArrayList<Integer> result=new ArrayList<>();
            scanner.close();
            merge(arr1,arr2,array1Size,array2Size,result);
            sort(result);
        }
}
