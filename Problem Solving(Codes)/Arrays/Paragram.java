import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Paragram 
{
    static boolean check(String str)
    {
        if(str.length() < 26)
        {
            return false;
        }
        else
        {
            ArrayList<Integer> ans = new ArrayList<>();

            for(int i=97; i<123; i++)
            {
                ans.add(i);
            }

            for(int i=0; i<str.length(); i++)
            {
                Integer ch = (int)str.charAt(i);

                ans.remove(ch);
            }

            if(ans.isEmpty())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    static boolean solution2(String str)
    {
        if(str.length() < 26)
        {
            return false;
        }
        else
        {
            ArrayList<Character> ans = new ArrayList<>();

            for(int i=0; i<str.length(); i++)
            {
                Character ch = str.charAt(i);
                
                if(ans.contains(ch))
                {
                    continue;
                }
                else
                {
                    ans.add(ch);
                }
            }

            if(ans.size() == 26)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        sc.close();

        boolean ans = solution2(str);

        System.out.println(ans);

    }
    
}
