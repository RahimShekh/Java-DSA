/*
    Accept Character from user and check whether it is alphabet or not.
    (A_Z a-z)

    Input :  F

    Output: TRUE

    Input :  &

    Output: FALSE
*/
import java.util.*;

class program1
{
    public static void Alphabet(char gh)
    {
        if(gh >= 'A' && gh <='Z')
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the chracter:");
        char ch = sobj.next().charAt(0);

        Alphabet(ch);
    }
}