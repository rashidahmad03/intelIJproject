package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oprater {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        String m[][]=new String[r][c];
        for (int i=0;i<r;i++)
        {

                m[i]=br.readLine().split("");
        }

        for (int i=0;i<r;i++)
        { for(int j=0;j<c;j++){


            System.out.print(m[i][j]);

           }
           System.out.println();
        }




        }











}
