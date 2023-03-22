import java.util.*;

public class ArrayRotation 
{
    static int[] solution2(int[] arr, int k)
    {
        int n = arr.length;

        if(n == k || k % n == 0)
        {
            return arr;
        }

        int rotate = k % n;

        int[] arr2 = new int[n];

        for(int i=0; i<rotate; i++)
        {
            arr2[i] = arr[n-rotate+i];
        }

        for(int i = 0; i < n-rotate; i++)
        {
            arr2[i+rotate] = arr[i];
        }

        return arr2;

    }

    static int[] solution(int[] arr, int k)
    {
        int n = arr.length;

        if(n == k || k % n == 0)
        {
            return arr;
        }

        int noOfRotation = k % n;

        for(int i=0; i<noOfRotation; i++)
        {
            rotate(arr);
        }

        return arr;
    }

    static void rotate(int[] arr)
    {
        int n = arr.length;

        int lastElement = arr[n-1];

        for(int i = n-1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = lastElement;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of matrix : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of matrix : ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of rotation : ");
        int k = sc.nextInt();

        sc.close();

        int[] arr2 = solution2(arr, k);

        System.out.println("New Array is : " + Arrays.toString(arr2));
        
    }    
}
