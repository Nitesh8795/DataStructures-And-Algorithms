import java.util.*;

public class RichestCustomer 
{
    static int wealthyCustomer(int[][] arr)
    {
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0, max = arr[0][0];

        for(int i=0; i<m; i++)
        {
            sum = 0;
            
            for(int j=0; j<n; j++)
            {
                sum = sum + arr[i][j];

                if(sum > max)
                {
                    max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row : ");
        int m = sc.nextInt();

        System.out.println("Enter the size of column : ");
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

        int res = wealthyCustomer(arr);

        System.out.println("Highest Wealth : " + res);
        
    }
}
