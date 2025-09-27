/*
Q. Find the unique element form the given array.
    arr[] = { 5 , 3, 2, 2, 3};
    o/p = 5

    `Explaiantion : 
    3 => 2
    2 => 2
    5 => 1
*/

import java.util.*;

class program1
{
    public static void Logic(int Brr[],int n)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++)
        {
            set.add(Brr[i]);
        }

        System.out.println(set);

        int newArr[] = new int[set.size()];

        int iCnt = 0;
        for(int it: set)
        {
            newArr[iCnt] = it;
            iCnt++;
        }

        for(int it: newArr)
        {
            System.out.println(it);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size:");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the No:");
        for(int i= 0; i<iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Logic(Arr,iSize);
    }
}