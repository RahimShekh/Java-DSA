/*
    write a program which accept number from user and cjeck whether it contains 0 in it or not.


    input  : 2395
    output : There is no Zero

    input  : 1018
    output : It Contains Zero
*/
import java.util.*;

class program18
{
    public static boolean Display(int iNo)
    {
        int iDigit = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                return true;
            }
            iNo = iNo/10;
        }
        return false;
    }
    public static void main(String arg[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the digit:");
        iValue = sobj.nextInt();

        bRet = Display(iValue);

        if(bRet == true)
        {
            System.out.println("It has a zero");
        }
        else
        {
            System.out.println("It doesnt have zero");
        }
    }
}
