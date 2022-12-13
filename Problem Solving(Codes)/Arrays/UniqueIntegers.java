import java.util.*;

public class UniqueIntegers 
{
    static int[] CombinationZero(int n)
    {
        int[] arr = new int[n];
        int cnt = 0;

        if(n == 1)
        {
            arr[0] = 0;

            return arr;
        }
        else if(n % 2 == 0)
        {
            for(int i=0; i<=n; i++)
            {
                int sum = i + (-i);

                if(cnt == n)
                {
                    break;
                }
                else
                {
                    if(sum == 0)
                    {
                        arr[i] = i+1;
                        arr[n-i-1] = -i-1;
                        cnt = cnt + 2;
                    }
                }
            }
        }
        else
        {
            arr[0] = 0;
            cnt = 1;
            for(int i=1; i<=n; i=i+2)
            {
                int sum = i + (-i);

                if(cnt == n)
                {
                    break;
                }
                else
                {
                    if(sum == 0)
                    {
                        arr[i] = i;
                        arr[i+1] = -i;
                        cnt = cnt + 2;
                    }
                }
            }
        }

        return arr;

    }

    static int[] sol2(int n)
    {
        int[] arr = new int[n];
        int cnt = 0;

        if(n == 1)
        {
            arr[0] = 0;
        }
        else if(n % 2 == 0)
        {
            int i = 0;

            while(cnt < arr.length)
            {
                arr[i] = i;
                arr[n-i-1] = -i;
                i++;
                cnt = cnt + 2;
            }
        }
        else
        {
            cnt = 1;
            arr[0] = 0;

            while(cnt < arr.length)
            {
                arr[cnt] = cnt;
                arr[cnt+1] = -cnt;
                cnt = cnt + 2;
            }
        }

        return arr;        
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        sc.close();

        int[] arr2 = sol2(n);

        System.out.println("Resultant Array : " + Arrays.toString(arr2));
    }
    
}
