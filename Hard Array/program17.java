/*  Pascal Traingle  
Type 2 => print nth row of pascal triangle or u can return a list
             1
          1    1
       1     2     1
     1    3     3      1
  1     4    6      4      1

    Ex - nthRow = 3
        output =>   [1,2,1] 
*/

import java.util.*;

class program17
{                              
    public static void nCr(int row,int col)  
    {
        int n = row - 1;   
        int r = col - 1;   

        int ans = 1;    

        ArrayList<Integer> list = new ArrayList<>(); 

        for(int i=0; i<r; i++)
        {
            ans = ans * (n-i);     
            ans = ans / (i+1);   
        }
        
        list.add(ans);  // add that value in a list

        for(int it : list)
        {
            System.out.print(it+" ");
        }
    }
    public static void Logic(int n)
    {
        for(int i=1; i<=n; i++)
        {
            nCr(n,i);
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the NthRow:");
        int NthRow = sobj.nextInt();

        Logic(NthRow);   
    }
}