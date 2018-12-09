import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplymath {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String f=br.readLine();
        int s= Integer.parseInt(f);


        String str = br.readLine();
        String mul = "";

        int o=Math.abs(f.length()-str.length());

        int p=Math.abs(str.length()-f.length());
        System.out.println(sp(f,o));
        System.out.println("*"+sp(str,p));
System.out.println("___________________");



        for(int i = str.length() - 1; i >= 0; i--)
        {
            mul = mul + str.charAt(i);
        }
        int a[]=new int[str.length()];
        int b[]=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
           int  d=multi(Integer.parseInt(String.valueOf(mul.charAt(i))),s);
           b[i]=d;
            a[i]= d*(int)(Math.pow(10,i));

        }
        printpatter(b);
System.out.println("..................................");
      int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);


    }
    static int multi(int c, int s){

return c*s;


    }
static void  printpatter(int[] a){
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                System.out.print(" ");
            }

                System.out.print(a[i]);

            System.out.println();
        }

}
static String sp(String s,int d){
        String q="";
        for(int i=0;i<=d;i++)
            q=" "+s;

    return q;

    }

}