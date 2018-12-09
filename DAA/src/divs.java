import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class divs {

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

          int h[]=  combinations(arr1);
        for(int kh:h)    System.out.print(kh+"   ");


        }
    }


    public static int[] combinations(int[] array) {
        int[] res = new int[-1 >>> -array.length];
        for (int i = array.length, k = 0; --i >= 0;) {
            int s = res[k] = array[i];
            for (int j = 0, x = k++; j < x;)
                res[k++] = s + res[j++];
        }
        return res;
    }
}
