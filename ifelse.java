import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){

        System.out.println("Enter Your Value");
Scanner inp= new Scanner(System.in);

//Boolean a= true;
//boolean c= true;
   //boolean b= false;

    //   if(a>12){
    //    System.out.println("num is greater than 12");
    //   }
// else{
    // System.out.println("num is less than 12");
// }

//if(a && b||c){
   // System.out.println("TRUE");
//}
//else{
   // System.out.println("FALSE");
//}

int age= inp.nextInt();

if(age>25){
    System.out.println("you can eligible for job");
}
else if(age<25||age>18){
    System.out.println("you are only eligible if you have master degree");
}

else{
    System.out.println("you are not eligible for job");
}


    }
}
