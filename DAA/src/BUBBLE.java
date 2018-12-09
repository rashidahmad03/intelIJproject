/*
* algo
* for i to lenght[a]
* for j=0  to lenght[a]- i-1
* if a[j]>a[j+1]
* exchange a[]j,a[j-1]
*
*
* */


public class BUBBLE

{
    public static void main(String[] args) {
        int a[]=new int[]{2,125,52,231,232,85,9,1,23,21,25};
        for(int i=1;i<=a.length;i++)
        {
            for(int j=0;j<=a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;

                }

            }

        }



        for(int s=0;s<a.length;s++)
        System.out.print(a[s]+" ");
    }
}
