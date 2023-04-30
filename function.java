import java.util.Scanner;

public class function {
    
    public static void main(String args[])
    {
        int c=0;
        while (c!=21)
         {
           int ans= multi(2, 4);
            System.out.println(ans*c);
            c++;
        }
    }
      static int multi(int a ,int b)
      {
       
        int ans=1;
       int dash= a*b;
        
        return dash*ans;
  }
}
