package excepthandle;

class num0 extends Exception
{
    num0(String msg)
    {
        super(msg);
    }
}

class numcmp extends Exception
{
    numcmp(String msg)
    {
        super(msg);
    }
}
public class cmdexcep 
{
    public static void main(String[] args) 
    {
        String a=args[0];
        int a1=Integer.parseInt(a);
        String b=args[1];
        int b1=Integer.parseInt(b);
        try
        {
            if(a1<0||b1<0)
            {
                throw new num0("Negative number.");
            }
            else if(a1>b1)
            {
                throw new numcmp("Wrong format");
            }
            else
            {
                for(int i=a1;i<=b1;i++)
                {
                    if(b1>1)
                    {
                        for(int j=2;j<i;j++)
                        {
                            if(i%j==0)
                                break;
                            if(i==j)
                            {
                                System.out.println(i);
                            }
                        }
                        
                    }
                }
            }
        }
        catch(num0 e)
        {
            System.err.println(e);
        }
        catch(numcmp e1)
        {
            System.err.println(e1);
        }
    }  
}
