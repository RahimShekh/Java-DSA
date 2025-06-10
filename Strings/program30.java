//Check the String is palindrome or not by using another string

import java.util.*;

class program30
{
    public static void Logic(String Str)
    {
        String ptr ="";
        for(int i = Str.length()-1; i >=0 ; i--)
        {
            char ch = Str.charAt(i);

            ptr = ptr + ch;
        }

        if(Str.equals(ptr))
        {
            System.out.print("The String is palindrome");
        }
        else
        {
            System.out.print("The String is Not palindrome");
        }
    }
    public static void main(String arg[])
    {
        Scanner  sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        Logic(str);

    }
}