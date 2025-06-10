/*
    0
    10
    010
    1010
 */
import java.util.*;

class program10
{
    public static void Pattern(int No)
    {
        
        for(int i = 1; i <= No; i++)
        {
            int start = 1;
            if(i % 2 == 0)
            {
                start = 1;
            }
            else
            {
                start = 0;
            }
           for(int j = 1; j <= i; j++)
           {
                System.out.print(start);
                start = 1-start;
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