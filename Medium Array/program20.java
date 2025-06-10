/*
Remove duplicates using hashset
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,-1,-1,-1,-1]
*/

import java.util.*;

class program20
{
    public static void main(String arg[])
    {
        HashSet<Integer> set = new HashSet<>();

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Elements:");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        for(int i = 0; i < size; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        for(int n : Arr)
        {
            set.add(n);
        }
        System.out.println(set);

        int index = 0;

        for(int No : set)
        {
            Arr[index] = No;
            index++;
        }

        while(index < size)
        {
            Arr[index] = -1;
            index++;
        }

        for(int i : Arr)
        {
            System.out.print(i+"\t");
        }

    }
}