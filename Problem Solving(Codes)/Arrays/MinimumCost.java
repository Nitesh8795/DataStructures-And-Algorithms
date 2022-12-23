import java.util.*;

public class MinimumCost 
{
    static int countChips(int[] arr)
    {
        int n = arr.length;
        int evenChips = 0, oddChips = 0, minCost = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i] % 2 == 0)
            {
                evenChips++;
            }
            else
            {
                oddChips++;
            }
        }

        if(evenChips >= oddChips)
        {
            minCost = oddChips;
        }
        else
        {
            minCost = evenChips;
        }

        return minCost;

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

        int res = countChips(arr);

        System.out.println("Minimum Cost : " + res);
        
    }
}
