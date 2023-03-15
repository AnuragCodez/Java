// import java.util.Scanner;
// import java.util.concurrent.CountDownLatch;

// public class practiceques {

  //     public static void main(String[] args){

    // Scanner inp = new Scanner(System.in);
//     System.out.println("Enter your Marks");
//     System.out.println("enter 1 ");
//     float a= inp.nextInt();
//     System.out.println("enter 2 ");
//     float b= inp.nextInt();
//     System.out.println("enter 3");
//     float c=inp.nextInt();
//     float dash= (a+b+c)/30;
//     System.out.println("Your CGPA is :" + dash);


//     }
// }

import java.util.Scanner;

public class practiceques {
    public static void main(String[] args)
    {
        
 Scanner inp= new Scanner(System.in);

 System.out.println("enter your number");

   boolean a= inp.hasNextInt();

   if(a==true)
   {
    System.out.println("it is an integer");
   }
   else
   {
    System.out.println("it is not an integer");
   }

    }
}


// import java.util.Scanner;

// public class practiceques{
//     public static void main(String[] args){
//        Scanner inp= new Scanner(System.in);
//        System.out.println("enter your name");
//        String name= inp.next();
//        System.out.println("Hello!" +name+ "Have a good day" );
    