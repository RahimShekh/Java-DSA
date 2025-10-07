/*
write a program which accept number from user and return difference between summation of even 
digits and summation of odd digits.
*/
import java.util.*;

class program19
{
    public static int Display(int iNo)
    {
        int iSum1 = 0, iSum2 = 0;

        while(iNo > 0)
        {
            int iDigit = iNo % 10; 

            if(iDigit % 2 == 0)
            {
                iSum1 = iSum1 + iDigit;
            }
            else if(iDigit % 2 != 0)
            {
                iSum2 = iSum2 + iDigit;
            }

            iNo = iNo/10;
        }
        return iSum1 - iSum2;
    }
    public static void main(String arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the digit:");
        iValue =  sobj.nextInt();

        iRet = Display(iValue);

        System.out.println("The differnce:"+iRet);
    }
}