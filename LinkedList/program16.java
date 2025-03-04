// Detect Linked List Loop Cycle


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

    public void CreateLoop()
    {
        node temp1  = First;
        node temp2 = First;

        temp1 = temp1.next.next;
        temp2 = temp2.next.next.next.next.next;

        temp2.next = temp1;
    }

    public void DetectLoopCycle()
    {
        node Teacher = First;
        node Student = First;
        boolean bFlag = false;

        while(Teacher != null && Teacher.next != null)
        {
            Teacher = Teacher.next.next;
            Student = Student.next;

            if(Teacher == Student)
            {
                bFlag = true;
                System.out.print("Cycle Detected");
                return;
            }
        }

    }
   
}
class program16
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

        if(No == 6)
        {
            obj.CreateLoop();
        }

        obj.DetectLoopCycle();

        //obj.Display();

    }
}