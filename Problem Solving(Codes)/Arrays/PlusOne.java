import java.util.*;

public class PlusOne 
{
    static int[] incrementValue(int[] arr)
    {
        int n = arr.length;

        if(arr[n-1] < 9)
        {
            arr[n-1] = arr[n-1] + 1;
            return arr;
        }
        else
        {
            int i = n-1;

            while(i >= 0)
            {
                if(arr[i] != 9)
                {
                    arr[i] = arr[i] + 1;
                    return arr;
                }

                arr[i] = 0;
                i--;
            }

            int[] result = new int[n + 1];
            result[0] = 1;
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

        sc.close();

        int[] result = incrementValue(arr);

        System.out.println("Resultatnt array : " + Arrays.toString(result));
        
    }
}
