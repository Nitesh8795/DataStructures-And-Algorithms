import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class CountItems 
{

    static int Count(String[][] arr, String ruleKey, String ruleValue)
    {
        int m = arr.length;

        int i = 0, j = 0, cnt = 0;

        if(ruleKey.equals("type"))
        {
            j = 0;
        }
        else if(ruleKey.equals("color"))
        {
            j = 1;
        }
        else
        {
            j = 2;
        }

        for(i = 0; i < m; i++)
        {
            if(ruleValue.equals(arr[i][j]))
            {
                cnt++;
            }
        }

        return cnt;
    }

    static int Count2(List<List<String>> arr, String ruleKey, String ruleValue)
    {
        int m = arr.size();

        int i = 0, j = 0, cnt = 0;

        if(ruleKey.equals("type"))
        {
            j = 0;
        }
        else if(ruleKey.equals("color"))
        {
            j = 1;
        }
        else
        {
            j = 2;
        }

        for(i = 0; i < m; i++)
        {
            if(ruleValue.equals(arr.get(i).get(j)))
            {
                cnt++;
            }
        }

        return cnt;    
    }    

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();

        System.out.println("Enter the number of column : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");

        String[][] arr = new String[m][n];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = br.readLine();
            }
        }

        System.out.println("Enter the ruleKey : ");
        String ruleKey = br.readLine();

        System.out.println("Enter the ruleValue : ");
        String ruleValue = br.readLine();

        sc.close();
        br.close();

        int res = Count(arr, ruleKey, ruleValue);

        List<List<String>> list = Arrays.stream(arr).map(Arrays::asList).collect(Collectors.toList());

        int res2 = Count2(list, ruleKey, ruleValue);

        System.out.println("Total number of items present are :" + res);
        System.out.println("Total number of items present are :" + res2);
        
    }
}
