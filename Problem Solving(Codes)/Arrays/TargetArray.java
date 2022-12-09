import java.util.*;

public class TargetArray 
{
    static int[] Result(int[] arr1, int[] index)
    {
        if(arr1.length == 1)
        {
            return arr1;
        }
        else
        {
            int[] target = new int[arr1.length];

            for(int i=0; i<arr1.length; i++)
            {
                target[i] = -1;
            }

            for(int i=0; i<arr1.length; i++)
            {
                if(i == 0)
                {
                    target[index[i]] = arr1[i];
                }
                else
                {
                    boolean check = isCorrect(target, index[i]);

                    if(check)
                    {
                        target[index[i]] = arr1[i];
                    }
                    else
                    {
                        target = addElement(target, index[i], arr1[i]);
                        target[index[i]] = arr1[i];
                    }
                }
            }

            return target;
        }
    }

    static boolean isCorrect(int[] arr, int index)
    {
        if(arr[index] == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static int[] addElement(int[] arr, int index, int element)
    {
        for(int i = arr.length-1; i > index; i--)
        {
            arr[i] = arr[i-1];
        }

        return arr;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter the elements of array : ");

        for(int i=0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];

        System.out.println("Enter the elements of index array : ");

        for(int i=0; i<n; i++)
        {
            arr2[i] = sc.nextInt();
        }

        sc.close();

        int[] arr3 = Result(arr1, arr2);

        System.out.println("Target Array : " + Arrays.toString(arr3));
        
    }        
}
