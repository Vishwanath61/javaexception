package excepthandle;

import java.util.*;

class num09 extends Exception
{
    num09(String msg)
    {
        super(msg);
    }
}

public class num09excep 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter A: ");
        String a=obj.next();
        System.out.print("Enter B: ");
        String b=obj.next();
        try
        {
            int a1=a.length();
            int b1=b.length();
            if(a1==1&&b1==1)
            {
                int a2=Integer.parseInt(a);
                int b2=Integer.parseInt(b);
                int sum=a2+b2;
                System.out.println("\n"+a2+"+"+b2+"="+sum);
            }
            else
                throw new num09("Error");
        }
        catch(num09 e)
        {
            System.out.println(e);
        }
    } 
}
