//Backtrack
import  java.util.*;

class program4
{
    public static void Logic(int iNo, int iNo2)
    {
        if(iNo2 < iNo)
        {
            iNo2++;
            
            Logic(iNo,iNo2);
           
            System.out.println(iNo2);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj  = new Scanner(System.in);
        int iNo = 0;
        System.out.println("Enter the No:");
        int No = sobj.nextInt();

        Logic(No,iNo);
    }
}