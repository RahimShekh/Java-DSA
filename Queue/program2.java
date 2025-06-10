import java.util.*;

class node
{
    public node next;
    public int data;
}

class Queue
{
    public int iCount;
    public node First;

    public Queue()
    {
        First = null;
        iCount = 0;
    }

    public void EnQueue(int No)
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
        
    }

    public void Display()
    {
        node temp = First;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|");
            temp = temp.next;
        }
    }

    public void DeQueue()
    {
        if(First == null)
        {
            System.out.print("Queue is Empty");
            return;
        }
        else{
            First = First.next;
        }
    }

    public void Double()
    {
        node temp = First;

        while(temp != null)
        {
            temp.data = temp.data * 2;
            temp = temp.next;
        }
    }
}
class program2
{
    public static void main(String arg[])
    {
        Queue obj = new Queue();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements:");
        int iSize = sobj.nextInt();

        for(int i = 1; i <= iSize; i++)
        {
            int iValue = sobj.nextInt();
            obj.EnQueue(iValue);
        }
        
        obj.Display();

        obj.Double();

        obj.Display();
    }
}