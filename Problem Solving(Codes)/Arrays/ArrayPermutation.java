import java.util.*;

public class ArrayPermutation 
{

    static int[] permutation(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        else
        {
            int[] res = new int[arr.length];

            for(int i=0; i<arr.length; i++)
            {
                res[i] = arr[arr[i]];
            }

            return res;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] arr1 = permutation(arr);

        System.out.println("Old Array : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(arr1));
    }  
    
}
