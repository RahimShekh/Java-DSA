/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 3   iCol = 5

    output : A  A   A   A   A
             B  B   B   B   B
             C  C   C   C   C
    Time Complexity : O(N)
*/
import java.util.*;
public class program27 
{
    public static void Pattern(int iRow,int iCol)
    {
        char ch ='A';

        for(int i = 1;i <= iRow;i++,ch++)
        {
            for(int j = 1;j <= iCol; j++)
            {
                System.out.print(ch+"\t");
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
