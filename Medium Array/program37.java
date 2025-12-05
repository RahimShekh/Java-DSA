/* Single Number
Given a non-empty array of integers nums, every element appears twice except for one.
Find that single one.
You must implement a solution with a linear runtime complexity and use only constant 
extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1
*/

import java.util.*;

class program37
{
    public static void Logic(int Brr[],int n)
    {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            int value = mpp.getOrDefault(Brr[i],0);
            mpp.put(Brr[i],value+1);
        }

        for(Map.Entry<Integer,Integer> it: mpp.entrySet())
        {
            if(it.getValue() == 1)
            {
                System.out.println("The unique value:"+it.getKey());
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Logic(arr,size);
    }
}