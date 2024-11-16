//Reverse Factors
import java.util.*;

class program4
{
    public static void FactRev(int iNo)
    {
        for(int i = iNo/2; i >1;i--)
        {
           if(iNo % i == 0)
           {
             System.out.println(i);
           }
        }
    }
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue = sobj.nextInt();

        FactRev(iValue);
    }
}