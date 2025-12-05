/*Merge Sorted Array
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 
respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored 
inside the array nums1. To accommodate this, nums1 has a length of m + n, where the
first m elements denote the elements that should be merged, and the last n elements
are set to 0 and should be ignored. nums2 has a length of n.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
*/

import java.util.*;

class program34
{
    public static void Logic(int Brr1[],int Brr2[],int m,int n)
    {

        for(int j=0,i=n; i<m; i++)
        {
            Brr1[i] = Brr2[j];
            j++;
        }

        Arrays.sort(Brr1);
        
        for(int it: Brr1)
        {
            System.out.print(it+" ");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the 1st Array size:");
        int size1 = sobj.nextInt();

        int arr1[] = new int[size1];

        for(int i=0; i<size1; i++)
        {
            arr1[i] = sobj.nextInt();
        }

        System.out.println("Enter the 2nd Array size:");
        int size2 = sobj.nextInt();

        int arr2[] = new int[size2];

        for(int i=0; i<size2; i++)
        {
            arr2[i] = sobj.nextInt();
        }

        Logic(arr1,arr2,size1,size2);
    }
}