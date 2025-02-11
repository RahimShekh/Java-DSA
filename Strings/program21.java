/*
    Write a program which accept string from user and copy that character of that string by
    removing all white spaces.

    Input : "Marvel lous Pyth on"

    Output : "MarvellousPython"    
*/
import java.util.*;

class program21
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str1 = sobj.nextLine();

        String str2 ="";

        for(int i = 0;i < str1.length(); i++)
        {
            char ch = str1.charAt(i);

            if(ch != ' ')
            {
                str2 = str2 + ch;
            }
        }

        System.out.println("The String:"+str2);
    }
}