/*
    Accept number of rows and number of columns and display below pattern.

    input  : iRow = 4   iCol = 4

    output : A  B   C   D
             a  b   c   d
             A  B   C   D
             a  b   c   d

    Time Complexity : O(N)

*/
import java.util.*;

class program26
{
    public static void Pattern(int iRow,int iCol)
    {
        
        for(int i = 1; i <= iRow; i++)
        {   
            char ch = 'A';
            for(int j = 1;j <= iCol; j++,ch++)
            {
                if(i % 2 == 0)
                {
                    ch = Character.toLowerCase(ch);
                    System.out.print(ch+"\t");
                
                }
                else
                {
                    System.out.print(ch+"\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter the Rows:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Column:");
        iValue2 = sobj.nextInt();

        Pattern(iValue1,iValue2);
    }
}