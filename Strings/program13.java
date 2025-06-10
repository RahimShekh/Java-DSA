/*
    Write a program which accept string from user and accept one caharacter. Return index of first 
    occurence of that character.

    Input : "Marvellous Multi OS"
                M

    Output : 0

    Input : "Marvellous Multi OS"
            W

    Output : -1
*/
import java.util.*;

class program13
{
    public static void main(String arg[])
    {
        char Ch =' ';
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        System.out.println("Enter the chracter to chk index:");
        char ch = sobj.next().charAt(0);

        for(int i = 0; i < str.length(); i++)
        {
            Ch = str.charAt(i);

            if(ch == Ch)
            {
                System.out.println(i);
                break;
            }
        }
        if(ch != Ch)
        {
            System.out.println("-1");
        }
    }
}