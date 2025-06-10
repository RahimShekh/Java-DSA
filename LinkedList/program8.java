//Doubly circular linked list

class node{
    public node next;
    public node prev;
    public int data;
}
class DoublyCL
{
    public node First;
    public node Last;
    public int iCount;

    public DoublyCL()
    {
        First = null;
        Last =  null;
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
            First = newn;
            Last = newn;
        }
        else
        {
            newn.next = First;
            First.prev = newn;
            First = newn;
        }
        Last.next = First;
        First.prev = Last;

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

    public void InsertLast(int no)
    {
        node newn = null;

        newn = new node();

        newn.data = no;
        newn.next = null;
        newn.prev = null;

        if(First == null && Last == null)
        {
            First = newn;
            Last =  newn;
        }
        else
        {
            Last.next = newn;
            newn.prev = Last;
            Last = newn;
        }
        Last.next = First;
        First.prev = Last;

        iCount++;
    }

    public void InsertAtPos(int iPos, int No)
    {
        node newn = null;

        newn = new node();

        newn.data = No;
        newn.next = null;
        newn.prev = null;

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

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;
            temp.next = newn;
            newn.prev = temp;
        }
        Last.next = First;
        First.prev = Last;
    }
    
}

class program8
{
    public static void main(String arg[])
    {
        DoublyCL obj = new DoublyCL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.InsertLast(131);

        obj.InsertAtPos(3,35);


        obj.Display();
    }
}