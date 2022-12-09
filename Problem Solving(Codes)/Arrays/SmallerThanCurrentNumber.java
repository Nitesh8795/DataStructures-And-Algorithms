import java.util.*;

public class SmallerThanCurrentNumber 
{

    static int[] Result(int[] arr)
    {
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            int cnt = 0;

            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] > arr[j] && i != j)
                {
                    cnt += 1;
                }
            }

            ans[i] = cnt;
        }

        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter the elements of array : ");

        for(int i=0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        sc.close();

        int[] arr2 = Result(arr1);

        System.out.println("Number Array : " + Arrays.toString(arr1));
        System.out.println("Resultant Array : " + Arrays.toString(arr2));
        
    }    
    
}
