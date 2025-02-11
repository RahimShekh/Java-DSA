/*
Write a program which accept 2 strings from user and concat N characetrs of second string
after first string. Value of N should be accepted from user. (Implement strncat() function).

Note : If third parameter is greater than size of second string then concat whole string after 
first string.

Input : "Marvellous Infosystems"
        "Logic Building"
         5

Output : "Marvellous Infosystems Logic"  
*/

import java.util.*;

class program22
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First String:");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String:");
        String str2 = sobj.nextLine();

        System.out.println("Enter the No to Concat:");
        int iNo = sobj.nextInt();

        int iLength = Math.min(iNo,str2.length());

        for(int i = 0;i < iLength; i++)
        {
            char ch = str2.charAt(i);

            str1 = str1 + ch;
        }

        System.out.println("The String:"+str1);
    }
}