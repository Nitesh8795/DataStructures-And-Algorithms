import java.util.*;

public class EvenDigit 
{

    static int evenDigit(int[] arr)
    {
        int n = arr.length;
        boolean result = false;

        if(n == 1)
        {
            result = countDigit(arr[0]);

            if(result)
            {
                return 1;
            }
            
            return 0;
        }
        else
        {
            int cnt = 0;

            for(int i=0; i<n; i++)
            {
                result = countDigit(arr[i]);

                if(result)
                {
                    cnt = cnt + 1;
                }
            }

            return cnt;
        }
    }

    static boolean countDigit(int num)
    {
        int cnt = 0;

        while(num > 0)
        {
            cnt++;

            num = num / 10;
        }

        if(cnt % 2 == 0)
        {
            return true;
        }
        
        return false;
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

        int ans = evenDigit(arr);

        System.out.println("Number with even digit are : " + ans);
    }
    
}
