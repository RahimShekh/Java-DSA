/*
    write a program which accept number from user and display its digits in reverse order.

    input  : 2395
    output : 5
             9
             3
             2
*/
import java.util.*;

class program17
{
    public static void Display(int iNo)
    {
        int iDigit = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo/10;
        }
    }
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the digit:");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}
