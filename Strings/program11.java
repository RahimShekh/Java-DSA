/*
    Write a program which accept string from user and accept one caharacter. Check whether that 
    character is present in string or not.
    Input : "Marvellous Multi OS"
                e

    Output : TRUE

    Input : "Marvellous Multi OS"
                W

    Output : FALSE
*/
import java.util.*;

class program11
{
    public static void main(String arg[])
    {
        boolean bFlag = false;
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
                bFlag = true;
            }
        }

        if(bFlag == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}