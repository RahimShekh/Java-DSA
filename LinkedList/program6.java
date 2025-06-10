//Doubly Linear Linked List

class node
{
    public node next;
    public int data;
    public node prev;
}

class DoublyLL
{
    public node First;
    public int iCount;

    public DoublyLL()
    {
        First = null;
        iCount = 0;
    }

    public void InsertFirst(int No)
    {
        node newn = null;

        newn = new node();

        newn.data = No;
        newn.next = null;
        newn.prev = null;

        if(First == null)
        {
            First = newn;
        }
        else
        {
            newn.next = First;
            First.prev = newn;
            First = newn;
        }
        iCount++;
    }

    public void Display()
    {
        node temp = First;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|-><-");
            temp = temp.next;
        }
        System.out.print("|NULL|");
    }

    public void InsertLast(int No)
    {
        node newn = null;

        newn = new node();

        newn.data = No;
        newn.next = null;
        newn.prev = null;

        if(First == null)
        {
            First = newn;
        }
        else
        {
            node temp = First;
            
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
            newn.prev = temp;
        }
        iCount++;
    }

    public void InsertAtPos(int iPos,int No)
    {
        if(iPos < 1 || iPos > iCount+1)
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
            newn.prev = null;

            node temp = First;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;
            temp.next = newn;
            newn.prev = temp;
        }
    }
}
class program6
{
    public static void main(String arg[])
    {
        DoublyLL obj = new DoublyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(133);

        obj.InsertAtPos(4,35);

        obj.Display();
    }
}