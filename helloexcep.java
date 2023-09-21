package excepthandle;

import java.util.*;

class helloex extends Exception
{
    helloex(String s)
    {
        super(s);
    }
}

public class helloexcep 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text=obj.next();
        try
        {
            if(text.equals("Hello"))
                throw new helloex("You have entered 'Hello'");
            else
                System.out.println(text);
        }
        catch(helloex e)
        {
            System.err.println(e);
        }
    }
}
