/*
    Write a program which accept string from user and copy Capital characters of that string into 
    another string.

    Input : "Marvellous Multi OS"

    Output : "MMOS"    
*/
import java.util.*;

class program18
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String Str = sobj.nextLine();

        String str ="";

        for(int i = 0; i < Str.length(); i++)
        {
            char ch = Str.charAt(i);

            if(ch >='A' && ch <='Z')
            {
                str = str + ch;
            }
        }

        System.out.println(str);
    }
}