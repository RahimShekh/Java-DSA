/*
    Accept character from user. if it is Capital then display all the characters from the input 
    caharacters till Z. If input character is small then print all the characters in reverse order 
    till a. In other cases return directly.

    Input : Q

    Output : Q R S T U V W X Y Z

    Input : m

    Output : m n  o p q r s t u v w x y z
*/
import java.util.*;

class program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the chracter:");
        char ch = sobj.next().charAt(0);

        if(ch >='A' &&  ch <='Z')
        {
            for(char gh = ch; gh <='Z'; gh++)
            {
                System.out.println(gh);
            }
        }
        else if(ch >='a' &&  ch <='z')
        {
            for(char gh = ch; gh <='z'; gh++)
            {
                System.out.println(gh);
            }
        }


    }
}