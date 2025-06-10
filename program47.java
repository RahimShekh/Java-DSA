/*
    Accept character from user. if it is Capital then display all the characters from the input 
    caharacters till Z. If input character is small then print all the characters in reverse order
    till a. In other cases return directly.

    Input : Q

    Output : Q R S T U V W X Y Z

    Input : m

    Output : m l k j i h g f e d c b a

    Input : 8

    Output : 8

*/
import java.util.*;

class program47
{
    public static void Alphabet(char str)
    {
        if((str >='A') && (str <='Z'))
        {
            for(char i = str;i <='Z';i++)
            {
                System.out.print(i+" ");
            }
        }
        else if((str >='a') && (str <='z'))
        {
            for(char i = str; i >='a';i--)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the chracter:");
        char ch = sobj.next().charAt(0);

        Alphabet(ch);
    }
}