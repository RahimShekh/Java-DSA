/*
    Write a program which accept string from user reverse that string in place.

    Input : "abcd"

    Output : "dcba"

    Input : "abba"

    Output : "abba"
*/
import java.util.*;

class program15
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        String Str =" ";

        for(int i = str.length()-1; i >= 0; i--)
        {
            char ch = str.charAt(i);

            Str = Str + ch;
        }

         System.out.println("Reversed String:"+Str);

    }

}