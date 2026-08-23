/* 4 sum problem
Given an array nums of n integers, return an array of all the unique quadruplets 
[nums[a], nums[b], nums[c], nums[d]] such that:0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
*/

import java.util.*;

class program20
{
    public static void Logic(int brr[],int n,int target)
    {
        HashSet<List<Integer>> finalSet = new HashSet<>(); 

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                HashSet<Integer> set = new HashSet<>();

                for(int k=j+1; k<n; k++)
                {
                    int fourth = target - (brr[i]+brr[j]+brr[k]);

                    if(set.contains(fourth))
                    {
                        List<Integer> list = Arrays.asList(brr[i], brr[j], brr[k], fourth);
                        Collections.sort(list);
                        finalSet.add(list);
                    }
                    set.add(brr[k]);
                }
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

        Logic(arr,size,0);
    }
}