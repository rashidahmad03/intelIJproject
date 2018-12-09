package part2;

public class sINGLE {

    private static sINGLE myObj;

    static{
        myObj = new sINGLE();
    }

    private sINGLE(){

    }

    public static sINGLE getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String a[]){
        sINGLE ms = getInstance();
        ms.testMe();
    }
}