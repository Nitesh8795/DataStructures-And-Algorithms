import java.util.*;

public class KidsCandies 
{

    static boolean[] candies(int[] Candies, int extra)
    {
        boolean[] arr2 = new boolean[Candies.length];

        int max = Candies[0];

        for(int i=0; i<Candies.length; i++)
        {
            if(max < Candies[i])
            {
                max = Candies[i];
            }
        }

        for(int i=0; i<Candies.length; i++)
        {
            int sum = Candies[i] + extra;

            if(sum >= max)
            {
                arr2[i] = true;
            }
            else
            {
                arr2[i] = false;
            }
        }

        return arr2;
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

        System.out.println("Enter the number of extra candies : ");
        int extra = sc.nextInt();

        sc.close();

        boolean[] arr1 = candies(arr, extra);

        System.out.println("Old Array : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(arr1));
        
    }    
    
}
