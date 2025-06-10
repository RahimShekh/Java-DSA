/*
    Write a program which accept string from user and return length of largest word.

    Input : "Marvellous Multi OS Infosystems"

    Output :  11
*/
import java.util.*;

class program26
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        int iMax = 0;
        int iLength = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch  ==' ')
            {
               if(iLength > iMax)
               {
                iMax = iLength;
               }
               iLength =  0;     // reset
            }
            else
            {
                iLength++;
            }
        }

        if(iLength > iMax)
        {
            iMax = iLength;
        }

        System.out.println("The longest word in string:"+iMax);
    }
}