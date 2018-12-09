public class ulpartten {
    public static void main(String[] args) {
        int t=0;
        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=i;j++)
            {
                t++;
                System.out.print(j);

            }

            System.out.println();
        }
        for(int i=5;i>=1;i--)
        {

            for(int j=1;j<i;j++)
            {
                t++;
                System.out.print(j);

            }

            System.out.println();
        }
    }
    }

