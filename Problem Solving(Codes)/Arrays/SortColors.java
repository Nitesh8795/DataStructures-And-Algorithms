import java.util.*;

public class SortColors 
{
    static int[] solution(int[] nums)
    {
        int n = nums.length;

        for(int i=0; i<n; i++)   
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] arr2 = solution(arr);

        System.out.println(Arrays.toString(arr2));
    }
    
}
