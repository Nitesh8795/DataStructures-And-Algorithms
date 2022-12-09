import java.util.*;

public class ShuffleArray 
{
    static int[] shuffle(int[] arr1, int n)
    {
        int[] arr2 = new int[arr1.length];

        if(arr1.length == 1)
        {
            return arr1;
        }
        else
        {
            int j = 0;

            for(int i=0; i<arr1.length; i++)
            {
                if(j < arr1.length)
                {
                    arr2[j] = arr1[i];
                    arr2[j+1] = arr1[i+n];
                    j = j+2;
                }
                else
                {
                    break;
                }
            }

            return arr2;
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

        System.out.println("Enter the mid point of the arrya : ");
        int x = sc.nextInt();

        sc.close();

        int[] arr1 = shuffle(arr, x);

        System.out.println("Old Array : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(arr1));
        
    }    
    
}
