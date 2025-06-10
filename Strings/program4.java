/*
    Write a program which accept string from user and count number of capital characters.

    Input :  "Marvellous Multi OS"

    Output :    4
*/

import java.util.*;

class program4
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        for(int i = 0; i < str.length(); i++)
        {
            char gh = str.charAt(i);

            if(gh >= 'A' && gh <='Z')
            {
                iCnt++;
            }
        }
        System.out.println("The Count of Capital:"+iCnt);

    }
}