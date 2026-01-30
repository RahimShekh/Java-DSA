/*   ugly number
An ugly number is a positive integer which does not have a prime factor other than
2, 3, and 5.
Given an integer n, return true if n is an ugly number.
Example 1:
Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:
Input: n = 1
Output: true
Explanation: 1 has no prime factors.
Example 3:
Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.*/

import java.util.*;

class uglynumber 
{
    public static void Logic(int num) {

        if (num <= 0) {
            System.out.println("Not an ugly number");
            return;
        }

        while (num % 2 == 0) {
            num = num / 2;
        }

        while (num % 3 == 0) {
            num = num / 3;
        }

        while (num % 5 == 0) {
            num = num / 5;
        }

        if (num == 1) {
            System.out.println("Ugly number");
        } else {
            System.out.println("Not an ugly number");
        }
    }

    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number:");
        int No = sobj.nextInt();

        Logic(No);
    }
}
