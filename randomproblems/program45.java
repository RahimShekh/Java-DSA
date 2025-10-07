/*
    Accept Character from user and check whether it is Capital or not.
    (A-Z )

    Input :  F

    Output: TRUE

    Input :  d

    Output: FALSE

*/
import java.util.*;
class program45
{
    public static boolean Alphabet(char str)
    {
        if((str >='A') && (str <='Z'))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the chracter:");
        char ch =sobj.next().charAt(0);

        bRet = Alphabet(ch);

        if(bRet == true)
        {
            System.out.println("It is a Capital");
        }
        else
        {
            System.out.println("It is not Capital");
        }
    }
}