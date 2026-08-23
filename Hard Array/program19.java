/* 3 sum problem
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such 
that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.  
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
*/

import java.util.*;

class program19
{
    public static void Logic(int brr[],int n)
    {
        HashSet<ArrayList<Integer>> finalSet = new HashSet<>(); // triplets should unique

        for(int i=0; i<n; i++)
        {
            HashSet<Integer> set = new HashSet<>();

            for(int j=i+1; j<n; j++)
            {
                int third = -(brr[i]+brr[j]); 

                if(set.contains(third))  // check third is available in set
                {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(brr[i]);
                    list.add(brr[j]);
                    list.add(third);
                    Collections.sort(list);
                    finalSet.add(list);
                }

                set.add(brr[j]);
            }
        }
            System.out.println(finalSet);
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