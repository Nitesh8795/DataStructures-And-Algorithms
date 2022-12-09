import java.util.*;

public class GoodPairs 
{

    static int Pairs(int[] arr)
    {
        int cnt = 0;

        if(arr.length == 1)
        {
            return cnt;
        }
        else
        {
            for(int i=0; i<arr.length; i++)
            {
                for(int j=i+1; j<arr.length; j++)
                {
                    if(arr[i] == arr[j] && i < j)
                    {
                        cnt ++ ;
                    }
                }
            }
    
            return cnt;            
        }
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

        int res = Pairs(arr);

        System.out.println("Old Array : " + Arrays.toString(arr));
        System.out.println("Number of Good Pairs in array are : " + res);
        
    }        
}
