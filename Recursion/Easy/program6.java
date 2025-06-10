//sum of numbers
import  java.util.*;

class program6
{
    static int iCnt = 1;
    static int iSum = 0;
    public static void Logic(int iNo)
    {
        
        if(iCnt <= iNo)
        {
            
            iSum =  iSum  +  iCnt;
            iCnt++;
            Logic(iNo);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj  = new Scanner(System.in);

        System.out.println("Enter the No:");
        int No = sobj.nextInt();

        Logic(No);

        System.out.println(iSum);
    }
}