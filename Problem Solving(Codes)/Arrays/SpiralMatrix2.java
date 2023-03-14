import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix2 
{

    static int[][] displayInSpiralForm(int x)
    {
        int[][] arr = new int[x][x];

        int top = 0, left = 0;
        int bottom = arr.length;
        int right = arr[0].length;
        int tne = bottom * right;
        int cnt = 0;

        while(top <= bottom && left <= right)
        {
            for(int i = left; i < right && cnt < tne; i++)
            {
                arr[top][i] = cnt+1;
                cnt++;
            }

            top = top + 1;

            for(int j = top; j < bottom && cnt < tne; j++)
            {
                arr[j][right-1] = cnt+1;
                cnt++;
            }

            right = right - 1;

            if(top >= bottom || left >= right)
            {
                break;
            }

            for(int m = right-1; m >= left && cnt < tne; m--)
            {
                arr[bottom-1][m] = cnt+1;A
                cnt++;
            }

            bottom = bottom - 1;

            for(int n = bottom - 1; n >= top && cnt < tne; n--)
            {
                arr[n][left] = cnt+1;
                cnt++;
            }

            left = left + 1;


        }

        return arr;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix : ");
        int n = sc.nextInt();

        sc.close();

        System.out.println(" Ans begins from here + \n");
        
        int[][] ans = displayInSpiralForm(n);

        System.out.println(Arrays.deepToString(ans));
        
    }
    
}
