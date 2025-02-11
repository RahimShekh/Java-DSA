/*
    Write a program which accept 2 strings from user and check whether first N contents of 2 
    strings are equal or not. (Implement strcmp() function).

    Input : "Marvellous Infosystems"
            "Marvellous Logic Building"
            10

    Output :   TRUE   
*/
import java.util.*;

class program24
{
    public static void main(String arg[])
    {
        boolean bFlag = true;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First String:");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String:");
        String str2 = sobj.nextLine();

        System.out.println("Enter the No to chk:");
        int iNo = sobj.nextInt();

        for(int i = 0;i < iNo; i++)
        {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if(ch1 != ch2)
            {
                bFlag = false;
                break;
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