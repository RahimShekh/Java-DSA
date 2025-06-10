//Taking input from user and finding even odd count in LL

import java.util.*;

class node
{
    public int data;
    public node next;
}

class SinglyLL
{
    public node First;
    public int iCount;

    public SinglyLL()
    {
        System.out.println("The object is Created");

        First = null;
        iCount = 0;
    }

    public void InsertFirst(int iNo)
    {
        node newn = null;

        newn = new node();

        newn.data =  iNo;
        newn.next = null;

        if(First == null)
        {
            First = newn;
        }
        else
        {
            newn.next = First;
            First = newn;
        }
        iCount++;
    }

    public void Display()
    {
        node temp = First;

        while(temp  != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.print("|NULL|");
    }

    public void EvenCount()
    {
        int iCnt1 = 0, iCnt2 = 0;
       node temp = First;

       while(temp != null)
       {
            if(temp.data % 2 == 0)
            {
                iCnt1++;
            }
            else if(temp.data % 2 != 0)
            {
                iCnt2++;
            }
            temp = temp.next;
       }

       System.out.println("The Even Count:"+iCnt1);
       System.out.println("The Odd Count:"+iCnt2);


    }
}
class program11
{
    public static void main(String arg[])
    {
        SinglyLL obj = new SinglyLL();
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter the Elements No:");
        int No = sobj.nextInt();

        for(int i = 0; i < No; i++)
        {
            int iValue =  sobj.nextInt();
            obj.InsertFirst(iValue);
        }

        obj.EvenCount();

        obj.Display();

    }
}