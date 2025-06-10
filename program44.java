/*
    Accept Character from user and check whether it is alphabet or not.
    (A_Z a-z)

    Input :  F

    Output: TRUE

    Input :  &

    Output: FALSE

*/
import java.util.*;
class program44
{
    public static boolean Alphabet(char str)
    {
        if((str >='A') && (str <='Z') || (str >='a') && (str <='z'))
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
            System.out.println("It is a Alphabet");
        }
        else
        {
            System.out.println("It is not a Alphabet");
        }
    }
}