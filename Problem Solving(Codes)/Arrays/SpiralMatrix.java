import java.util.Scanner;

public class SpiralMatrix 
{

    static void displayInSpiralForm(int[][] arr)
    {
        int top = 0, left = 0;
        int bottom = arr.length;
        int right = arr[0].length;
        int tne = bottom * right;
        int cnt = 0;

        while(top <= bottom && left <= right)
        {
            for(int i = left; i < right && cnt < tne; i++)
            {
                System.out.print(arr[top][i] + " -> ");
                cnt++;
            }

            top = top + 1;

            for(int j = top; j < bottom && cnt < tne; j++)
            {
                System.out.print(arr[j][right-1] + " -> ");
                cnt++;
            }

            right = right - 1;

            if(top >= bottom || left >= right)
            {
                break;
            }

            for(int m = right-1; m >= left && cnt < tne; m--)
            {
                System.out.print(arr[bottom-1][m] + " -> ");
                cnt++;
            }

            bottom = bottom - 1;

            for(int n = bottom - 1; n >= top && cnt < tne; n--)
            {
                System.out.print(arr[n][left] + " -> ");
                cnt++;
            }

            left = left + 1;


        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row of matrix : ");
        int m = sc.nextInt();

        System.out.println("Enter the column of matrix : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of matrix : ");

        int[][] arr = new int[m][n];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println(" Ans begins from here + \n");
        displayInSpiralForm(arr);
        
    }
    
}
