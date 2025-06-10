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

class program11
{
    public static int Logic(int No)
    {
       if(No <= 1)
       {
        return No;
       }

       return Logic (No-1)+ Logic(No-2);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int iNo = sobj.nextInt();

        for(int i  = 0; i < iNo; i++)
        {
            System.out.println(Logic(i));
        }
    }
}