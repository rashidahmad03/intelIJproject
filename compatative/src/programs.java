import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class programs {
    public static void main(String[] args) throws IOException {
      final StringBuilder f=new StringBuilder();
      final BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
      final int g=Integer.parseInt(d.readLine());
      for(int i=0;i<g;i++)
      {
          final String x[]=d.readLine().split(" ");
          if(x[0].equals("+"))
          {
              final int strt =Integer.parseInt(x[1]);
              final String  substring=x[2];
              f.insert(strt,substring);

          }
          else
          {

          }
      }

       System.out.println(f);


    }




}
