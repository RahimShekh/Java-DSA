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
}

class program1
{
    public static void main(String arg[])
    {
        stack obj = new stack();

        obj.Push(51);
        obj.Push(21);
        obj.Push(11);

        int iDelete = obj.pop();

        System.out.println("The Popped element:"+iDelete);
    }
}