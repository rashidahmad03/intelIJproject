import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void datecheck(String  n) {
String s[]=n.split("[/:-]");
int dat=Integer.parseInt(s[0]);
String mo=s[1];
int year=Integer.parseInt(s[2]);
if(leap(year))
{

}
if(mo.equals("01")) {
System.out.println(mo);
        }


//for(String d:s)
//System.out.println(d);

}



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       String n = scanner.nextLine();


        datecheck(n);

        scanner.close();
    }
    static boolean leap(int year){
        if(year%400==0)
            return true;
        else if(year%100==0)
        return false;
        if(year%4==0)
            return true;
        else
            return false;
    }
}

