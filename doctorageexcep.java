package excepthandle;

class AgeNotWithinRangeException extends Exception
{
    AgeNotWithinRangeException(String msg)
    {
        super(msg);
    }
}

class NameNotValidException extends Exception
{
    NameNotValidException(String msg)
    {
        super(msg);
    }
}

class Doctor
{
    int id,age;
    String name,department;
    Doctor(int i,int ag,String nm,String dep)
    {
        id=i;
        age=ag;
        name=nm;
        department=dep;
    }
}

public class doctorageexcep 
{
    public static void main(String[] args) 
    {
        Doctor d=new Doctor(123,50,"Vishwa","CSE");
        try
        {
            int age1=d.age;
            if(age1<25||age1>65)
            {
                throw new AgeNotWithinRangeException("Age Not Within Range Exception");
            }       
        }
        catch(AgeNotWithinRangeException e)
        {
            System.err.println(e);
        }
        
        try
        {
            int namel=d.name.length();
            for(int i=0;i<namel;i++)
            {
                char c=d.name.charAt(i);
                if((c>=65&&c<=90)||(c>=97&&c<=122))
                {
                    
                }
                else
                {
                    throw new NameNotValidException("Name Not Valid Exception");
                }
            }
        }
        catch(NameNotValidException e1)
        {
            System.err.println(e1);
        }
    }
}
