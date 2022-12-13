import java.util.*;

public class TwoSum 
{

    static int[] findSum(int[] arr, int target)
    {
        int n = arr.length;

        int[] result = new int[2];

        if(n == 2)
        {
            result[0] = 0;
            result[1] = 1;

            return result;
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                for(int j=i+1; j<n; j++)
                {
                    int sum = arr[i] + arr[j];

                    if(sum == target)
                    {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }

            return result;
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

    System.out.println("Enter the target sum : ");
    int target = sc.nextInt();

    sc.close();

    int[] result = findSum(arr, target);

    System.out.println("The resultant array : " + Arrays.toString(result));
 }   
}
