// Reverse Linked List


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
    
    public void ReverseLL()
    {
        node Previous = null;
        node Next = null;
        node Current = First;

        while(Current != null)
        {
            Next = Current.next;
            Current.next = Previous;
            Previous = Current;

            Current = Next;
        }
        First = Previous;
    }
   
}
class program17
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

        
        obj.Display();

        obj.ReverseLL();

        obj.Display();

    }
}