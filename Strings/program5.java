/*
    Write a program which accept string from user and check whether it contains vowels in it or not

    Input :  "marvellous"

    Output : TRUE

    Input :  "Demo"

    Output : TRUE

    Input :  "xyz"

    Output : FALSE
*/

import java.util.*;

class program5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        boolean bFlag = false;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
            {
                bFlag = true;
            } 
        }

        if(bFlag == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}