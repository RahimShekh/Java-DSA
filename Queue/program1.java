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
}
class program1
{
    public static void main(String arg[])
    {
        Queue obj = new Queue();

        obj.EnQueue(51);
        obj.EnQueue(21);
        obj.EnQueue(11);
        
        obj.Display();
        
        obj.DeQueue();

        obj.Display();
    }
}