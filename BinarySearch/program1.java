/*
 array is = {3, 4, 6, 7, 9, 12, 16, 17} and target = 6.
 ans - 2  (return index)
 
 time complexity = O(logn)
*/

import java.util.*;

class program1
{
    public static void Logic(int Brr[], int n,int target)
    {
        int start = 0;
        int end = n-1;

        while(start <= end)
        {
            int imid = start+(end-start)/2;

            if(Brr[imid] == target)
            {
                System.out.println("The elements present at:"+imid);
                break;
            }
            else if(target >= Brr[imid])
            {
                start = imid + 1;
            }
            else
            {
                end = imid - 1;
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int n = sobj.nextInt();

        int Arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the Element to find:");
        int k = sobj.nextInt();

        Logic(Arr,n,k);
    }
}