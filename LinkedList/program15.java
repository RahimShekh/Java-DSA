//Middle Element of Linked List


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

    public void Middle()
    {
        int iMid = iCount/2;

        node temp = First;

        for(int i = 0; i < iMid; i++)
        {
            temp = temp.next;
        }

        System.out.println("The middle Element:"+temp.data);
    }

    public void  MiddleX()
    {
        node Teacher = First;
        node Student = First;

        while(Teacher != null && Teacher.next != null)
        {
            Teacher = Teacher.next.next;
            Student = Student.next;
        }

        System.out.println("The middle Element:"+Student.data);
    }
   
}
class program15
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

        obj.MiddleX();

        obj.Display();

    }
}