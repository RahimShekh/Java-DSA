/* Contains Duplicate II
Given an integer array nums and an integer k, return true if there are two distinct 
indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false                   
summary => is program mein humme duplicate dudna hai jiski index minus kare toh woh k tak ho sirf
0-1 <= 3   */
import java.util.*;

class program36
{
    public static boolean Logic(int Brr[],int n,int k)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++)
        {
            if(set.contains(Brr[i]))
            {
                return true;
            }

            set.add(Brr[i]);    // add values in set

            if(set.size() > k)
            {
                set.remove(Brr[i-k]);    // remove a element 
            }
        }

        return false;
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
        System.out.println("enter the value of target:");
        int target  = sobj.nextInt();

        boolean bflag = Logic(arr,size,target);

        System.out.println("The ans:"+bflag);
    }
}