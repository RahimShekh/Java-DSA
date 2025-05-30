import java.util.*;

class node
{
    public node next;
    public int data;
}
class stack
{
    public node First;
    public int icount;

    public stack()
    {
        First = null;
        icount = 0;
    }

    public void Push(int No)
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
        icount++;
    }

    public int pop()
    {
        int iPop = 0;

        if(First == null)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            iPop = First.data;
            First = First.next;
            
        }
        return iPop;
    }

    public void Display()
    {
        node temp = First;

        while(temp != null)
        {
            System.out.println("|"+temp.data+"|");
            temp = temp.next;
        }
    }

    public void reverse()
    {
        node Next = null;
        node prev = null;
        node current = First;

        while(current != null)
        {
            Next = current.next;
            current.next = prev;
            prev = current;

            current = Next;
        }

        First = prev;
    }
}

class program3
{
    public static void main(String arg[])
    {
        stack obj = new stack();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Stack elements:");
        int iSize = sobj.nextInt();

        for(int i = 1; i <= iSize; i++)
        {
            int Value = sobj.nextInt();
            obj.Push(Value);
        }

        obj.Display();
        
        System.out.println("Reverse Elements:");

        obj.reverse();

        obj.Display();
        int iDelete = obj.pop();

        System.out.println("The Popped element:"+iDelete);
    }
}