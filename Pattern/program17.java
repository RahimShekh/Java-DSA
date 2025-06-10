/*
    E
    D E
    C D E
    B C D E
    A B C D E
 */
import java.util.*;

class program17
{
    public static void Pattern(int No)
    {
        for(int i = 0; i < No; i++)
        {
            for(char ch=(char)('E'-i); ch <='E';ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }        
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int no = sobj.nextInt();

        Pattern(no);
    }
}