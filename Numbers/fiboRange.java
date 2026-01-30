/*
fibonacci number   n = 10
0 1 1 2 3 5 8                          
0
0+1 = 1
1+1 = 2
1+2 = 3
2+3 = 5
*/

import java.util.*;

class fiboRange
{
    public static void Logic(int n)
    {
        int first = 0;
        int second = 1;

        System.out.println(first);
        while(second <=n)
        {
            System.out.println(second);
            int next = first + second;

            first = second;
            second = next;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = sobj.nextInt();

        Logic(num);
    }
}