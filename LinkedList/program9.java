//Doubly circular  LL

class node
{
    public node next;
    public node prev;
    public int data;
}

class  DoublyCL
{
    public node First;
    public node Last;
    public int iCount;

    public DoublyCL()
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
        newn.prev = null;

        if(First == null && Last == null)
        {
            First =  newn;
            Last = newn;
        }
        else
        {
            newn.next = First;
            First.prev = newn;
            First = newn;
        }
        First.prev = Last;
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

        System.out.print("|"+"Null"+"|");
    }

    public void InsertLast(int No)
    {
        node newn = null;

        newn = new node();

        newn.data = No;
        newn.next = null;
        newn.prev = null;

        if(First == null && Last == null)
        {
            First = newn;
            Last = newn;
        }
        else
        {
            Last.next = newn;
            newn.prev  =  Last;
            Last = newn;
        }
        First.prev = Last;
        Last.next = First;
        iCount++;
    }

    public void InsertAtPos(int iPos,int No)
    {
        if(iPos ==1)
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
            newn.prev = null;

            node temp = First;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            newn.next =  temp.next;
            temp.next.prev  = newn;
            temp.next = newn;
            newn.prev = temp;
        }
        First.prev  = Last;
        Last.next = First;

        iCount++;
    }

    public void DeleteFirst()
    {
        if(First  == null && Last == null)
        {
            System.out.print("Linked List is Empty");
            return;
        }
        else
        {
            First = First.next;
        }
        First.prev = Last;
        Last.next = First;
        iCount--;
    }

    public void DeleteLast()
    {
        if(First == null && Last == null)
        {
            return;
        }
        else
        {
            Last = Last.prev;
        }
        Last.next = First;
        First.prev = Last;
        iCount--;
    }

    public void Count()
    {
        System.out.print("The Count:"+iCount);
    }

    public void DeleteAtPos(int iPos)
    {
        if(iPos < 0 || iPos > iCount)
        {
            System.out.println("Invalid input");
            return;
        }
        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos ==  iCount)
        {
            DeleteLast();
        }
        else
        {
            node temp = First;

            for(int i = 1; i< iPos-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
        First.prev = Last;
        Last.next = First;
        iCount--;
    }
}
class program9
{
    public static void main(String arg[])
    {
        DoublyCL obj = new DoublyCL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.InsertAtPos(3,45);

        //obj.DeleteFirst();
        
        //obj.DeleteLast();

        obj.DeleteAtPos(4);

        obj.Display();
        obj.Count();
    }
}