/*
    Write a program which accept 2 strings from user and check whether contents of two strings are
    equal or not. (Implement strcmp() function).

    Input : "Marvellous Infosystems"
            "Marvellous Infosystems"

    Output : TRUE    
*/
import java.util.*;

class program23
{
    public static void main(String arg[])
    {
        boolean bFlag = true;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First String:");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String:");
        String str2 = sobj.nextLine();

        int iLength = Math.min(str1.length(),str2.length());

        for(int i = 0;i < iLength; i++)
        {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if(ch1 != ch2)
            {
                bFlag = false;
                break;
            }
        }

            if(bFlag && str1.length() == str2.length())
            {
                System.out.println("TRUE");
            }
            else
            {
                System.out.println("FALSE");
            }
    }
}