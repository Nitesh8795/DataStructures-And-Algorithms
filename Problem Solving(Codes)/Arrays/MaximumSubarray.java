import java.util.*;

public class MaximumSubarray 
{
    static int SubArray(int[] arr)
    {
        int n = arr.length;

        if(n == 1)
        {
            return arr[0];
        }
        else
        {
            int sum = 0, max = arr[0],j=0;

            for(int i=0; i<n; i++)
            {
                if(i == 0)
                {
                    j=0;
                }
                else
                {
                    j=i;
                }

                for(; j<n; j++)
                {
                    sum += arr[j];

                    if(sum > max)
                    {
                        max = sum;
                    }
                }

                sum = 0;
            }

            return max;
        }
    }

    static int solution2(int[] arr)
    {
        int n = arr.length;

        if(n == 1)
        {
            return arr[0];
        }
        else
        {
            int sum = 0, max = arr[0];

            for(int i=0; i<n; i++)
            {
                sum = sum + arr[i];

                if(sum > max)
                {
                    max = sum;
                }

                if(sum < 0)
                {
                    sum = 0;
                }
            }

            return max;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] arr2 = arr.clone();

        int maxElement = solution2(arr);
        int maxElement2 = SubArray(arr2);

        
        System.out.println("Maximum element result1 : " + maxElement2);
        System.out.println("Maximum elemnt of subarrya : " + maxElement);
    }
    
}
