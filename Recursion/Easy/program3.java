import  java.util.*;

class program3
{
    static int iCnt = 1;
    public static void Logic(int iNo)
    {
        if(iCnt <= iNo)
        {
            System.out.println(iCnt);
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
    }
}