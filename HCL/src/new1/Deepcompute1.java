package new1;

public class Deepcompute1 {

    public static void main(String[] args) {

        String encryptstring="deep compute"; //given input
        String s="";
        for(int i=0;i<encryptstring.length();i++)
        {
            //only char for  check  condition Character values
            if((((int)encryptstring.charAt(i)>64) && ((int)encryptstring.charAt(i)<91) ) ||(((int)encryptstring.charAt(i)>96) && ((int)encryptstring.charAt(i)<123) ))
            {
                if(encryptstring.charAt(i)=='z')    //this for rotation of word
                  s=s+'a';
              else if(encryptstring.charAt(i)=='Z')
                    s=s+'A';
               else
                 s=s+(char)((int)encryptstring.charAt(i)+1);//change to int then increment by 1
            }
            else
                s=s+encryptstring.charAt(i);
        }
        System.out.println(s);

    }


}
