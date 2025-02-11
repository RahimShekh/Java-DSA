/*
    Write a program which accept string from user and check whether the string is pallindrome
    or not without considering its case.

    Input : "1abccBA1"

    Output : TRUE    
*/
import java.util.*;

class program25
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        String Str ="";

        for(int i = str.length()-1; i >= 0; i--)
        {
            char ch = str.charAt(i);

            Str = Str + ch;

        }

        if(str.equals(Str))
        {
            System.out.println("The String is Palindrome");
        }
        else
        {
            System.out.println("The String is not Palindrome");
        }
    }
}