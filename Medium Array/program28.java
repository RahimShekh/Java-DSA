
//Two sum problem
//brute force

import java.util.*;

class program28
{
    public static int[] TwoSum(int Brr[],int Target)
    {
        int temp[] = new int[2];

        for(int i=0; i < Brr.length; i++)
        {
            for(int j= i+1; j < Brr.length; j++)
            {
                if(Brr[i] == Brr[j]) continue;

                if(Brr[i] + Brr[j] == Target)
                {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return null;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the No:");
        int isize = sobj.nextInt();

        int Arr[] = new int[isize];

        for(int i=0; i< isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the Target:");
        int target = sobj.nextInt();

        int ans[] = TwoSum(Arr,target);

        System.out.println("The index is:"+ans[0]+" "+ans[1]);
    }
}