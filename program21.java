/*
    Accept number from user and display below pattern.

    input  : 5
    output : 5 # 4 # 3 # 2 # 1 # 
    Time Complexity : O(N)
*/
import java.util.*;

class program21
{
    public static void Display(int iNo)
    {
        for(int iCnt = iNo; iCnt > 0;  iCnt--)
        {
            System.out.print(iCnt+"\t # \t");
        }
    }
    public static void main(String[] args) 
    {
        int iValue = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}