/*
    Write a program which accept 2 strings from user and concat second string after first string. 
    (Implement strcat() function ).

    Input : "Marvellous Infosystems"
            "Logic Building"

    Output : "Marvellous Infosystems Logic Building"    
*/
import java.util.*;

class program19
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First String:");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String:");
        String str2 = sobj.nextLine();

        for(int i = 0; i < str2.length(); i++)
        {
            char ch = str2.charAt(i);
            
            str1 = str1 + ch;
        }

        System.out.println(str1);
    }
}