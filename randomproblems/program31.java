/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 4   iCol = 5

    output : 2  4   6   8   10
             1  3   5   7   9
             2  4   6   8   10
             1  3   5   7   9

    Time Complexity : O(2N)

*/
import java.util.*;
public class program31
{
    public static void Pattern(int iRow,int iCol)
    {
        int iCnt = 1;
        for(int i = 1;i <= iRow;i++)
        {
            for(int j = 1;j <= iCol*2; j++)  // columns badao 4*2 = 8
            {
               if(i % 2  != 0)
               {
                    if(j % 2 == 0)
                    {
                        System.out.print(j+"\t");
                    }
               }
               else if(i % 2 == 0)
               {
                if(j % 2 != 0)
                {
                    System.out.print(j+"\t");
                }
               }
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter the Rows");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the columns");
        iValue2 = sobj.nextInt();

        Pattern(iValue1,iValue2);
    }    
}
