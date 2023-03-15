import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class pracquestion4b {
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int day= inp.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
        
                case 2:
                System.out.println("tuesday");
                break;

                case 3:
                System.out.println("wednesday");
                break;

                case 4:
                System.out.println("thusday");
                break;

                case 5:
                System.out.println("friday");
                break;


                case 6:
                System.out.println("saturday");
                break;

                case 7:
                System.out.println("sunday");
                break;
        }

    //  QUESTION 2//

    Scanner year = new Scanner(System.in);
System.out.println("enter year");

    int b = year.nextInt();

   
     if((b%100==0) && (b%4==0))
    {System.out.println("not a leap year");
}
else if(b%400==0){
    System.out.println("leap year");
}
    else{System.out.println("not leap year");
}


    }
}
