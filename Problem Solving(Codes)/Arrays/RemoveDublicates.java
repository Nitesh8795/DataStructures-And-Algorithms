import java.util.*;

public class RemoveDublicates 
{
    static int removeDublicated(int[] arr)
    {
        int n = arr.length;

        if(arr[0] == arr[n-1])
        {
            return 1;
        }
        
        int j = 0;

        for(int i=0; i<n-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[n-1];
        j++;

        return j;
    }

    static int[] removeDublicate(int[] arr)
    {
        int n = arr.length;

        if(arr[0] == arr[n-1])
        {
            return arr;
        }
        
        int j = 0;

        for(int i=0; i<n-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[n-1];
        j++;

        return arr;
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

        int cnt = removeDublicated(arr);
        int[] arr1 = removeDublicate(arr);

        System.out.println("Total number of elements are : " + cnt);
        System.out.println("New Array is : " + Arrays.toString(arr1));
    }
    
}
