/*
Accept character from user. if Character is small display its corresponding capital character, 
and if it is small then display its corresponding capital. In other cases display as it is.
*/

import java.util.*;

class program2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Chracter:");
        char ch = sobj.next().charAt(0);

        if(ch  >= 'A' && ch <= 'Z')
        {
            System.out.println((char) (ch + 32));
        }
        else if(ch >='a' && ch <='z')
        {
            System.out.println((char) (ch + 32));
        }
    }
}