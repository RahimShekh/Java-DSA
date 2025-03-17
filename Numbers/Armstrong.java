/*
    153 = 1*1*1 + 5*5*5 + 3*3*3
         =   1   + 125  + 27
         =   153
 */
import java.util.*;

class Armstrong
{
    public static void Logic(int iNo)
    {
        int iDigit =  0, iSum = 0;
        int iNo2 = iNo;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit*iDigit*iDigit;
            iNo = iNo/10;
        }

        if(iSum == iNo2)
        {
            System.out.println("Number is Armstorng");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int No = sobj.nextInt();

        Logic(No);
    }
}