/*
    Write a program which accept string from user and convert it into upper case.

    Input : "Marvellous Multi OS"

    Output : mARVELLOUS mULTI os

*/
import java.util.*;

class program9
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch >= 'A' && ch <='Z')
            {
                System.out.print((char)(ch+32));
            }
            else if(ch >= 'a' && ch <='z')
            {
                System.out.print((char)(ch-32));
            }
        }
    }
}