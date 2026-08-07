/*  Pascal Traingle  
Type 3 => given the nthRow print the pascal traingle or return a list 
             1
          1    1
       1     2     1
     1    3     3      1
  1     4    6      4      1

    Ex - nthRow = 3
        output =>   [[1],[1,1],[1,2,1]] 
*/

import java.util.*;

class program18
{                              
    public static int nCr(int row,int col)  
    {
        int n = row - 1;   
        int r = col - 1;   

        int ans = 1;     

        for(int i=0; i<r; i++)
        {
            ans = ans * (n-i);     
            ans = ans / (i+1);   
        }
       
       return ans;

    }
    public static void Logic(int n)
    {
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();

        for(int i=1; i<=n; i++)
        {
            ArrayList<Integer> list = new ArrayList<>();

            for(int j=1; j<=i; j++)
            {
                list.add(nCr(i,j));   // current row will get add here
            }

            finalList.add(list);   // add the the current list into our main list
        }

        System.out.println(finalList);
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the NthRow:");
        int NthRow = sobj.nextInt();

        Logic(NthRow);   

    }
}