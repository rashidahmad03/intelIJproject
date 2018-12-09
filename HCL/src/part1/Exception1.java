package part1;

public class Exception1 {
    public static void main(String[] args) {
        int x=5;int y=0;
    try {
        try {
            System.out.println(x);
            System.out.println(x / y);
            System.out.println(y);
        }catch(ArithmeticException ex)
        {
            System.out.println("inner catch1");
            throw ex;

        }
        catch(RuntimeException ex)
        {
            System.out.println("inner catch 2");
throw ex;
        }
        finally{
            System.out.println("finaly");
        }
    }catch(Exception ex)
    {
        System.out.println("outer");
        throw ex;
    }





    }




}
