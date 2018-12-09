import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Arrrotate {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[]{2,125,52,231,232,85,9,1,23,21,25};
        int r=Integer.parseInt(br.readLine());
        for(int i=0;i<r;i++)
            mai(a);

        for (int s : a)
            System.out.print(s + " ");

    }
    static  void mai(int[] a) {
        int tem = a[0];
        int i;
        for (i = 0; i < a.length - 1; i++)
            a[i] = a[i + 1];
        a[i] = tem;

    }
}
