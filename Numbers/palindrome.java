import java.util.*;

class palindrome
{
    public static void Logic(int iNo)
    {
        int iDigit =  0, iValue = 0;
        int iNo2 = iNo;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iValue = (iValue * 10) + iDigit;
            iNo = iNo/10;
        }

        if(iValue == iNo2)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
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