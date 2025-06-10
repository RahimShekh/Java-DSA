//Singly Circular Linked List

class node
{
    public int data;
    public node next;
}

class SinglyCL
{
    public node First;
    public int iCount;
    public node Last;

    public SinglyCL()
    {
        First = null;
        Last = null;
        iCount = 0;
    }

    public void InsertFirst(int No)
    {
        node newn = null;

        newn = new node();

        newn.data = No;
        newn.next = null;

        if(First == null && Last == null)
        {
            First = newn;
            Last = newn;
        }
        else
        {
            newn.next = First;
            First = newn;
        }
        Last.next = First;

        iCount++;
    }

    public void Display()
    {
        node temp = First;

        do
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }while(temp != Last.next);

        System.out.print("|NULL|");
    }

    public void InsertLast(int No)
    {
        node newn = null;

        newn = new node();

        newn.data = No;
        newn.next = null;

        if(First == null && Last == null)
        {
            First = newn;
            Last = newn;
        }
        else
        {
            Last.next = newn;
            Last = newn;
        }
        Last.next = First;
        iCount++;
    }

    public void InsertAtPos(int iPos, int No)
    {
        if(iPos < 1 ||  iPos > iCount+1)
        {
            System.out.print("Invalid position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(No);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(No);
        }
        else
        {
            node newn = null;

            newn = new node();

            newn.data = No;
            newn.next = null;

            node temp = First;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;
        }
        Last.next = First;
        iCount++;
    }

    public void DeleteFirst()
    {
         if(First == null && Last == null)
        {
            System.out.print("The Linked List is Empty");
            return;
        }
        else
        {
            First = First.next;
        }
        Last.next = First;
        iCount--;
    }

    public void DeleteLast()
    {
        if(First == null && Last == null)
        {
            System.out.print("The Linked List is Empty");
            return;
        }
        else
        {
            node temp = First;

            do
            {
                temp = temp.next;
            }while(temp.next != Last);

            temp.next = First;
            Last = temp;
        }
        Last.next = First;
        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        if(iPos == 1)
        {
            DeleteFirst();
        }
        else  if(iPos == iCount)
        {
            DeleteLast();
        }
        else{

            node temp = First;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
        iCount--;
    }
}
class program5
{
    public static void main(String arg[])
    {
        SinglyCL obj = new SinglyCL();

        obj.InsertFirst(55);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(133);

        obj.InsertAtPos(3,35);

        //obj.DeleteFirst();
        //obj.DeleteLast();

        obj.DeleteAtPos(4);

        obj.Display();
    }
}