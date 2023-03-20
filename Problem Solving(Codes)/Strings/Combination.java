package Strings;

import java.util.Scanner;

public class Combination 
{
    static String Combine(String[] arr)
    {
        StringBuilder sb = new StringBuilder();

        int len = findLength(arr);

        for(int i=0; i<len; i++)
        {
            for(String words : arr)
            {
                if(words.length() > i)
                {
                    sb.append(words.charAt(i));
                }
            }
        }

        return sb.toString();
    }

    static int findLength(String[] arr)
    {
        int maxLen = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(maxLen < arr[i].length())
            {
                maxLen = arr[i].length();
            }
        }

        return maxLen;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");

        String[] arr = new String[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.next();
        }

        sc.close();

        String result = Combine(arr);

        System.out.println(result);
        
    }   
}
