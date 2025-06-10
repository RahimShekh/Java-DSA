/*
    Write a program which accept string from user and accept one caharacter. Return frequency of 
    that character.

    Input : "Marvellous Multi OS"
                M

    Output : 2

    Input : "Marvellous Multi OS"
                W

    Output : 0
*/
import java.util.*;

class program12
{
    public static void main(String arg[])
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        System.out.println("Enter the chracter:");
        char ch = sobj.next().charAt(0);


        for(int i = 0; i< str.length(); i++)
        {
            char iCh = str.charAt(i);

            if(ch == iCh)
            {
                iCnt++;
            }
        }

        System.out.println("the Count :"+iCnt);
    }
}