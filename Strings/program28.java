/*

    Write a program which accept string from user and print below pattern.

    Input : "Marvellous"

    Output :    M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 
                M   a   r   v   e   l   l   o   u   s 

    Input :  "PPA"

    Output :    P   P   A
                P   P   A
                P   P   A

*/
import java.util.*;

class program28
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the String:");
        String str = sobj.nextLine();

        for(int i = 0; i  < str.length(); i++)
        {
            for(int j = 0; j < str.length(); j++)
            {
                char ch = str.charAt(j);

                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}