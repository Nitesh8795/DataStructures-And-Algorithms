import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SplitElements 
{
    static int[][] resultFunction(int[] arr)
    {
        int n = arr.length;
        
        int[][] ans = new int[n/2][n/2];

        for(int i = 0; i<n; i++)
        {
            int count = countOccurrences(arr, arr[i]);

            if(count >=3)
            {
                return ans;
            }
        }

        ans = splitArray2(arr);

        return ans;

    }

    public static int[][] splitArray(int[] arr) 
    {
        Set<Integer> set = new HashSet<>();

        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];

        int idx1 = 0, idx2 = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (idx2 < arr2.length && !set.contains(arr[i])) 
            {
                arr2[idx2++] = arr[i];
                set.add(arr[i]);

            } 
            else 
            {
                arr1[idx1++] = arr[i];
            }
        }

        return new int[][]{arr1, arr2};
    }

    static int[][] splitArray2(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();

        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length / 2];

        int id1 = 0, id2 = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(id1 < arr1.length && !list.contains(arr[i]))
            {
                arr1[id1++] = arr[i];
                list.add(arr[i]);
            }
            else
            {
                arr2[id2++] = arr[i];
            }
        }

        return new int[][]{arr1, arr2};
    }
    
    public static int countOccurrences(int[] arr, int num) 
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == num) 
            {
                count++;
            }
        }
        return count;
    }
    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[][] ans = resultFunction(arr);

        System.out.println(Arrays.deepToString(ans));
    }
    
}
