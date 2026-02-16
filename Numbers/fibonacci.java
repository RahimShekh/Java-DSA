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
    public static void Logic(int n)
    {
        int first = 1;
        int second = 0;
        int next = 0;

        for(int i=0; i<n; i++)
        {
            System.out.print(next+" ");
            next = first + second;
            
            first = second;
            second = next;
        }   
    }
    public static void main(String arg[])
    {
        Scanner sobj = null;
        sobj =  new Scanner(System.in);

        System.out.println("Enter the No:");
        int iNo = sobj.nextInt();

        Logic(iNo);
    }
}