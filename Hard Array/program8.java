/* Next Permutation
Input: Arr[] = {1,3,2}
Output: {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} ,
{3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.

Input : Arr[] = {3,2,1}
Output: {1,2,3}
Explanation : As we see all permutations of {1,2,3}, we find {3,2,1} at the last position.
So, we have to return the lowest permutation.       */

import java.util.*;

class program8{
    public static void Logic(int Brr[],int n)
    {
        //find the breakpoint
        int index = -1;

        for(int i=n-2; i>=0; i--)
        {
            if(Brr[i] < Brr[i+1])
            {
                index = i;
                break;
            }
        }
        //if we dont find the breakpoint
        if(index == -1)
        {
            reverse(Brr,0,n-1);
            return;
        }

        //swap find greater no than breakpoint no then swap
        for(int i=n-1; i>=0; i--)
        {
            if(Brr[index] < Brr[i])
            {
                int temp = Brr[i];
                Brr[i] = Brr[index];
                Brr[index] = temp;
                break;  
            }
        }
        reverse(Brr,index+1,n-1);
    }
    public static void reverse(int arr[],int start, int end)
    {
        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        for(int i=0; i<size; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,size);

        for(int it: Arr)
        {
            System.out.print(it+" ");
        }
    }
}