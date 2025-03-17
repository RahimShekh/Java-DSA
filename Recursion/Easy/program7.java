//sum of numbers functional way
import  java.util.*;

class program7
{
    static int iCnt = 1;
    static int iSum = 0;
    public static int Logic(int iNo)
    {
        
        if(iCnt <= iNo)
        {
            
            iSum =  iSum  +  iCnt;
            iCnt++;
            Logic(iNo);
        }
       return iSum;
    }
    public static void main(String arg[])
    {
        Scanner sobj  = new Scanner(System.in);

        System.out.println("Enter the No:");
        int No = sobj.nextInt();

        int iValue = Logic(No);

        System.out.println(iValue);
    }
}