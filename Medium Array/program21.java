/*
Input:   n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:  {1,2,3,4,5}
Explanation: 
Common Elements in arr1 and arr2  are:  2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5}
 */

import java.util.*;

class program21
{
    public  static void main(String arg[])
    {
        HashSet<Integer> set = new HashSet<>();

        int Arr1[] = {1,2,3,3,4,5};
        int Arr2[] = {1,1,2,3,5,6,7};

        for(int it : Arr1)
        {
            set.add(it);
        }

        for(int it : Arr2)
        {
            set.add(it);
        }

        System.out.print(set);

        int size = set.size(); // if u dont know the size of array u can use
        int index = 0;               // arraylist
        int Union[] = new int[size];

        for(int it : set)
        {
            Union[index] = it;
            index++;
        }

        for(int it : Union)
        {
            System.out.println(it);
        }
    }
}