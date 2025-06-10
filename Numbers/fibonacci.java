/*
fibonacci number
0 1 1 2 3 5 8 13 21 34                          
0
0+1 = 1
1+1 = 2
1+2 = 3
2+3 = 5
*/
import java.util.*;

class fibonacci
{
    public static void Logic(int No)
    {
        int iFirst = 0;
        int iSecond = 1;
        int next = 0;

        System.out.println(iFirst+"\n"+iSecond);
        for(int i = 3; i < No; i++)
        {
            next = iFirst + iSecond;

            System.out.println(next);

            iFirst = iSecond;
            iSecond = next;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int iNo = sobj.nextInt();

        Logic(iNo);
    }
}