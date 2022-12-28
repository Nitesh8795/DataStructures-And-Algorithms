import java.util.*;

public class MatrixDiagonalSum 
{
    static int calculateSum(int[][] arr)
    {
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;

        if(m == 1 && n == 1)
        {
            return arr[0][0];
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if((i == j) || (i+j == m-1))
                {
                    sum = sum + arr[i][j];
                }
            }
        }        

        return sum;
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

        int res = calculateSum(arr);

        System.out.println("Sum of diagonal of matrix : " + res);
        
    }
}
