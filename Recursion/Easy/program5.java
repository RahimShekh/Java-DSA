//Backtrack

import java.util.Scanner;

class program5
{
    public static void Logic(int iNo, int iNo2)
    {
        if(iNo < 1)  
        {
            return;
        }

        iNo--;

        Logic(iNo,iNo2);

        System.out.println(iNo);
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int No = 5;

        Logic(No, 5);
    }
}
