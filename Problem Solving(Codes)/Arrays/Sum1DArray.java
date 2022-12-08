import java.util.*;

public class Sum1DArray 
{
    static int[] sum(int[] arr)
    {
        int[] res = new int[arr.length];

        if(arr.length == 1)
        {
            return arr;
        }
        else
        {
            for(int i=0; i<arr.length; i++)
            {
                if(i == 0)
                {
                    res[i] = arr[i];
                }
                else
                {
                    int sum = arr[i] + res[i-1];

                    res[i] = sum;
                }
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

        int[] arr1 = sum(arr);

        System.out.println("Old Array : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(arr1));
    }   
}
