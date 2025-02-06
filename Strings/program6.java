/*
    Write a program which accept string from user and display it in Reverse order.
    Input :  "MarvellouS"

    Output : "SuollevraM"

*/

import java.util.*;

class program6
{
    public static void main(String arg[])
    {
        Scanner sobj = new  Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        int iLength = str.length();

        for(int i = iLength-1; i >= 0; i--)
        {
            char ch = str.charAt(i);

            System.out.print(ch);
        }
    }
}