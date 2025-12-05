/* Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

summary => nums 1 mein jo element hai voh dusre nums2 array mein hai kya check karo jo honge usey return karo
*/

import java.util.*;

class program38
{
    public static void Logic(int Brr[],int m,int Brr1[],int n)
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for(int i=0; i<m; i++)
        {
            set.add(Brr[i]);
        }

        for(int it: Brr1)
        {
            if(set.contains(it))
            {
                resultSet.add(it);
            }
        }
        //convert set into array
        int setSize = resultSet.size();

        int ans[] = new int[setSize];
        int val = 0;
        for(int it: resultSet)
        {
            ans[val++] = it;
        }

        for(int it: ans)
        {
            System.out.print(it+" ");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the 1st array size:");
        int size = sobj.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i] = sobj.nextInt();
        }
        System.out.println("Enter the 2nd array size:");
        int size1 = sobj.nextInt();

        int arr1[] = new int[size1];

        for(int i=0; i<size1; i++)
        {
            arr1[i] = sobj.nextInt();
        }

        Logic(arr,size,arr1,size1);
    }
}