import java.util.*;

public class LargestAltitiude 
{
    static int result(int[] arr)
    {
        int n = arr.length;
        int max = 0;

        if(n == 1)
        {
            if(max > arr[0])
            {
                return max;
            }
            else
            {
                return arr[0];
            }
        }
        else
        {
            int sum = 0;

            for(int i=0; i<n; i++)
            {
                sum = sum + arr[i];

                if(sum > max)
                {
                    max = sum;
                }
            }

            return max;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of arrya : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int max_alt = result(arr);

        System.out.println("The maximum altitude throughout the journey : " + max_alt);
    }
    
}
