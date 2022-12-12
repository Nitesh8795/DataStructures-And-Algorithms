import java.util.Arrays;
import java.util.Scanner;

class Concatenation_2
{
    static int[] concatenate_func(int[] arr1)
    {
        int j=0;

        int new_length = arr1.length;

        int[] arr2 = new int[2*new_length];

        for(int i=0; i<arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }

        for(int i=arr1.length; i<arr2.length; i++)
        {
            arr2[i] = arr1[j];
            j++;
        }

        return arr2;
    }

    static int[] concatenate_func2(int[] arr1)
    {
        
        int new_length = arr1.length;

        int[] arr2 = new int[2*new_length];

        for(int i=0; i<arr2.length; i++)
        {
            arr2[i] = arr1[i%arr1.length];
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

        sc.close();

        int[] arr1 = concatenate_func2(arr);

        System.out.println("Old Array : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(arr1));
        
    }
}