//Check the String is palindrome or not by using another string

import java.util.*;

class program10
{ 
    public static String Logic(String Str,String ptr,int iCnt)
    {
        if(iCnt >= 0)
        {
            char ch = Str.charAt(iCnt);

            ptr = ptr + ch;
            iCnt--;
            return Logic(Str,ptr,iCnt);
        }
       return ptr;
    }
    public static void main(String arg[])
    {
        Scanner  sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        String str2 ="";

        str2 = Logic(str,str2,str.length()-1);

        if(str.equals(str2))
        {
            System.out.println("The String is Palindrome");
        }
        else
        {
            System.out.println("The String is not Palindrome");
        }
    }
}