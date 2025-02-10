/*
    Write a program which accept string from user and copy the content of that string into another 
    string. (Implement strcpy() function).

    Input : "Marvellous Multi OS"

    Output : "Marvellous Multi OS"      in another string.
*/
import java.util.*;

class program16
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        String Str =" ";

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            Str = Str + ch;
        }

         System.out.println("String:"+Str);

    }

}