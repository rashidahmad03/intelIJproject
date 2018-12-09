import java.util.Locale;

public class ted {
    public static void main(String[] args) {
       String d="hello i m mukul";
       String s[]=d.split(" ");
for(int i=0;i<s.length;i++)
{
System.out.print(change(s[i])+" ");
}
    }
    static String change(String d)
    {
        String v="";
        for(int i=d.length()-1;i>=0;i--)
        {
           v=v+d.charAt(i);
        }
        return v;
    }
}
