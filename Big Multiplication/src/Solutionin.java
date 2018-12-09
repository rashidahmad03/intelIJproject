import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solutionin
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  num = Integer.parseInt(br.readLine());
        String d[]=new String[num];
        for(int i=0;i<num;i++)
        {
            d[i]=br.readLine();

        }

        Long aj[]=new Long[num];

        for(int i=0;i<num;i++) {
           aj[i]=chnage(d[i]);
           System.out.println(aj[i]);
        }
    }
    public static Long chnage(String d)
    {
        long s=1;
        StringTokenizer sr=new StringTokenizer(d);

        while (sr.hasMoreTokens()){
            long x= Long.parseLong(sr.nextToken());
            Long c= Long.valueOf(sr.nextToken());
           s=(x*c)%3;
        }
        return s;
    }
}
