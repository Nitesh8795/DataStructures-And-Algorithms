import java.util.Arrays;
import java.util.Scanner;

public class FlipImage 
{
    static int[][] flipAndInvert(int[][] arr)
    {
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0; i<m; i++)
        {
            reverseArray(arr[i]);
        }

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[i][j] == 0)
                {
                    arr[i][j] = 1;
                }
                else
                {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }

    static void reverseArray(int[] arr)
    {
        int last = arr.length-1;
        int m = arr.length;

        for(int i=0; i<m/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;

            last--;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();

        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");

        int[][] arr = new int[m][n];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int[][] res = flipAndInvert(arr);

        System.out.println(Arrays.deepToString(res));
        
    }
}
