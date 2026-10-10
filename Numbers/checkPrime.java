/* what is prime number?
that exactly 2 factors which 1 and itself thats prime number
Given an integer N, determine whether it is a Prime Number or not. Return true if it is prime, otherwise return false.
A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.
Example 1
Input: N = 7
Output: true
Explanation: The number 7 is divisible only by 1 and 7, so it is a prime number.
Example 2
Input: N = 12
Output: false
Explanation: The number 12 is divisible by 2, 3, 4, and 6 as well, so it is not a prime number.     
2,3,5,7,11 are prime numbers 1 is not */

import java.util.*;

class checkPrime
{
    public static void Logic(int num)
    {
        int iCnt = 0;
        for(int i=1; i<=num; i++)
        {
            if(num % i == 0)
            {
                iCnt++;
            }
        }
        if(iCnt == 2)
        {
            System.out.println("Its Prime number");
        }
        else
        {
            System.out.println("Its not Prime number");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int No = sobj.nextInt();

        Logic(No);
    }
}