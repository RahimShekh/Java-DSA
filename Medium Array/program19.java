/*
Remove duplicates using hashset
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3]
*/

import java.util.*;

class program19
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
            System.out.print(n+"\t");
        }

        for(int i = 0; i < size; i++)
        {
            set.add(Arr[i]);
        }

        System.out.println(set);
    }
}