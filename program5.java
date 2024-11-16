import java.util.*;

class program5
{
    public static int SumNonFact(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
    public static void main(String arg[])
    {
        Scanner  sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number:");
        iValue = sobj.nextInt();

        int iRet = SumNonFact(iValue);

        System.out.println("Sum of Non Factors:"+iRet);

    }
}