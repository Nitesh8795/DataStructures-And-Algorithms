import java.util.Scanner;

public class ArthimeticMean 
{
    static int findEqual(int[] arr)
    {
        int check = 0, num1=0, num2=0;

        if(arr.length == 1)
        {
            return check;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(i == 0)
            {
                num1 = 0;
            }
            else
            {
                num1 = arr[i-1];
            }

            if(i == arr.length-1)
            {
                num2 = 0;
            }
            else
            {
                num2 = arr[i+1];
            }

            int sol = (num1 + num2) / 2;

            if(arr[i] == sol)
            {
                check++;
            }
        }

        return check;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // To take the length of array

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int result = findEqual(arr);

        System.out.println("Ans : " + result);
    }
    
}
