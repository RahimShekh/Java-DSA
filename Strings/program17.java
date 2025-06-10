/*
    Write a program which accept string from user and copy the content of that string into another 
    string. (Implement strncpy() function).

    Input : "Marvellous Multi OS"
            10 -> copies 10 bytes only...

    Output : "Marvellous"      in another string.

    Note : If third parameter is greater than the size of source string the copy whole string into 
    destination.
*/
import java.util.*;

class program17
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        System.out.println("Enter the bytes to Copy:");
        int iNo = sobj.nextInt();

        String Str ="";
        
        if(iNo <= 0)
        {
            System.out.println("Plz Enter the Valid bytes");
        }

        int iLength = Math.min(iNo,str.length());

        for(int i = 0; i < iLength; i++)
        {
                char ch = str.charAt(i);

                Str = Str + ch;
           
        }

         System.out.println("String:"+Str);

    }

}