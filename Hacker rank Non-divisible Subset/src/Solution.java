import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String d=br.readLine();
        String ad[]=d.split(" ");
        int da=Integer.parseInt(ad[0]);
        int k=Integer.parseInt(ad[1]);

      String  data=br.readLine();
      String datal[]=data.split(" ");
      int x[]=new int[datal.length];
      for(int i=0;i<datal.length;i++)
          x[i]=Integer.parseInt(datal[i]);
         int f =checkdata(k,x);
         System.out.print(f);



    }
static int checkdata(int x,int[] g)

{
    int as=0;
    for(int i=0;i<g.length;i++) {
        for (int j = 0; j < g.length; j++) {
            if (i==j)
                continue;
            if ((g[i]+g[j])%x != 0) {
                as++;

            }

        }
    }
    return as;
}




}
