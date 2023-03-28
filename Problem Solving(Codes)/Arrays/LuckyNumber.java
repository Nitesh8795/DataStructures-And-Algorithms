import java.util.*;

public class LuckyNumber 
{
    static List<Integer> luckyNumber(int[][] arr)
    {
        List<Integer> list = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
        int element = 0;

        int min = arr[0][0];

        for(int i=0; i<m; i++)
        {
            min = arr[i][0];
            element = 0;

            for(int j=0; j<n; j++)
            {
                if(min > arr[i][j])
                {
                    min = arr[i][j];
                    element = j;
                }
            }

            if(isMax(arr, i, element))
            {
                list.add(arr[i][element]);
            }
        }

        return list;
    }

    static boolean isMax(int[][] arr, int i, int j)
    {
        int max = arr[i][j];

        for(int m=0; m<arr.length; m++)
        {
            if(max < arr[m][j])
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of row : ");
        int m = sc.nextInt();

        System.out.println("Enter the length of col : ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the elements of array : ");

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        List<Integer> ans = luckyNumber(arr);

        System.out.println("Ans is " + ans);
                
    }
    
}
