import java.text.DecimalFormat;
import java.util.Scanner;


public class preceoperator {
    public static void main(String[ ]args){

       //Precedence of operators
       Scanner inp= new Scanner(System.in);

      System.out.println("enter your number");
  //PRECEDENCE AND ASSOCIATIVE//

  // Highest PRECEDENCE goes to * and /.
  // They are then evaluted on the basis of left to right associativity.  
  // Left to right.


  
//   int x= inp.nextByte();
//   int z= inp.nextByte();
//   int y= inp.nextByte();
//     int k= (x*x-4*x*z)/2*x;   

//     System.out.println(k);

//    int a=inp.nextInt();

//    int b=inp.nextInt();

//    int k= a*a-b*b;
//    System.out.println(k);
    
    int a=inp.nextInt();
    int b=inp.nextInt();
    int d=inp.nextInt();

    int k= a*b-d;

    System.out.println("The value of k is:"+k);

      
     
    


   
        


    }
}
