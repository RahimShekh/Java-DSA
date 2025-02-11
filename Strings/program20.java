/*
    Write a program which accept string from user and copy that character of that string into another string in reverse order.

    Input : "Marvellous Python"

    Output : "nohtyP suollevraM"    
*/
import java.util.*;

class program20
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str1 = sobj.nextLine();

        String str2 ="";

        for(int i = str1.length()-1; i >= 0; i--)
        {
            char ch = str1.charAt(i);

            str2 = str2 + ch;
        }

        System.out.println("The Reversed String:"+str2);
    }
}