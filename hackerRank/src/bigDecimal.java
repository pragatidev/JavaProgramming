import java.math.BigDecimal;
import java.util.*;


class bigDecimal{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        BigDecimal[]num = new BigDecimal[n];
        for (int i=0; i<n i++)
        	num[i]=BigDecimal.valueOf(s[i]);
      
        //Output
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(s[i]);
        }

    }


}
