/*
    Write a program which accept string from user and count number of white spaces.

    Input : "MarvellouS"

    Output : 0

    Input : "MarvellouS Infosystems"

    Output : 1
*/

import java.util.*;

class program10
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == ' ')
            {
                iCnt++;
            }
        }

        System.out.println("The White Spaces:"+iCnt);
    }
}