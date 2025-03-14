/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */
import java.util.*;

class program9
{
    public static void Pattern(int No)
    {
        
        for(int i = 1; i <= 2*No-1; i++)
        {
            int stars  = i;
            if(i > No)
            {
                stars = 2*No-i;
            }
            for(int j = 0; j < stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int no = sobj.nextInt();

        Pattern(no); 
    }
}