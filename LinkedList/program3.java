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
        First = null;
        iCount = 0;
    }

    public void InsertFirst(int No)
    {
        node newn = null;

        newn = new node();

        newn.data = No;
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

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
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
        }
        iCount++;
    }

    public void InsertAtPos(int iPos,int No)
    {
        node newn = null;

        newn = new node();

        newn.data = No;
        newn.next = null;

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
            node temp = First;

            int i = 1;
            while(i < iPos-1)
            {
                temp =  temp.next;
                i++;
            }

            newn.next = temp.next;
            temp.next = newn;
        }
        iCount++;
    }

    public void DeleteFirst()
    {
        if(First == null)
        {
            System.out.println("Linekd List is Empty");
            return;
        }
        else
        {
            First = First.next;
        }
        iCount--;
    }

    public void DeleteLast()
    {
        if(First == null)
        {
            System.out.println("Linekd List is Empty");
            return;
        }
        else if(First.next == null)
        {
            First = null;
        }
        else
        {
            node temp = First;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }
        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        if(iPos < 1 || iPos > iCount)
        {
            System.out.println("Invalid position");
            return;
        }
        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else
        {
            node temp = First;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
        iCount--;
    }

    public int Count()
    {
        return iCount;
    }
}

class program3
{
    public static void main(String arg[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(133);

        obj.InsertAtPos(3,45);

        //obj.DeleteFirst();

        //obj.DeleteLast();

          obj.DeleteAtPos(5);

        obj.Display();

        int iNo = obj.Count();

        System.out.print("The Count of nodes:"+iNo);
    }
}