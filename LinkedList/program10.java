//Singly linear LL

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

    public void Addition()
    {
        node temp = First;
        int iNo = 0;

        while(temp != null)
        {
            iNo = iNo + temp.data;
            temp = temp.next;
        }

        System.out.println("The Addition:"+iNo);
    }
}
class program10
{
    public static void main(String arg[])
    {
        SinglyLL obj = new SinglyLL();
        
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Addition();

        obj.Display();

    }
}