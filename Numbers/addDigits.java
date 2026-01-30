/*   Add Digits
Given an integer num, repeatedly add all its digits until the result has only one 
digit, and return it. 
Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 
*/

import java.util.*;

class addDigits
{
    public static void Logic(int n)
    {
       while(n >= 10)
       {
            int sum = 0;

            while(n > 0)
            {
                int iDigit = n % 10;
                sum = sum + iDigit;
                n = n / 10;
            }
            n = sum;      // sum ki value dalo vapas
       }

       System.out.println("The value:"+n);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = sobj.nextInt();

        Logic(num);
    }
}