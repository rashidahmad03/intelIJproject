import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        for (int k = 0; k < d; k++) {
            String da = br.readLine();
            int dh = Integer.parseInt(br.readLine());
            String[] arr = da.split(" ");

            int size = arr.length;
            int arr1[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr1[i] = Integer.parseInt(arr[i]);
            }

            int hum=sum(arr1);
            System.out.println(hum/size);


        }
    }
    static int sum(int arr1[])
    {

int c=0;
for(int g:arr1)
    c=c+g;

return c;
    }
}
