/*
    Accept character from user. if Character is small display its corresponding capital 
    character, and if it is small then display its corresponding capital. In other cases display 
    as it is.
*/
import java.util.*;

class program46
{
    public static void Alphabet(char str)
    {
        if((str >='a') && (str <='z'))
        {
            System.out.println((char)(str-32));
        }
        else if((str >='A') && (str <='Z'))
        {
            System.out.println((char)(str+32));
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
/*
 In Java, when you perform arithmetic operations on characters, you get their
  corresponding Unicode values (integers), not the character itself. To fix this, you should 
  convert the result back into a character by casting the integer back to a char.
 */