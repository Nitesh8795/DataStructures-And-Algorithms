import java.util.*;

public class TransposeMatrix 
{

    static int[][] transposeOperation(int[][] arr)
    {
        int m = arr.length;
        int n = arr[0].length;

        int[][] arr2 = new int[n][m];

        if(m == 1 && n == 1)
        {
            return arr;
        }

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr2[j][i] = arr[i][j];
            }
        }

        return arr2;
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
        
        int[][] res = transposeOperation(arr);

        System.out.println(Arrays.deepToString(res));
    }
}
