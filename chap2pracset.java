import java.util.Scanner;

public class chap2pracset {
    public static void main(String[] args){

      // QUESTION 1//


        float a=7/4f*9/2f;
        System.out.println(a);

//QUESTION 2//


       char cr= 'A';
       int x= cr+8;
        System.out.println(x);

//QUESTION 3//


       Scanner inp= new Scanner(System.in);

System.out.println("Enter your num:");

       int m= inp.nextInt();
        
        int v= 4;

        if(m>v){
       System.out.println("This num is greater than given value" + v);
        }
        else{
            System.out.println("This num is less than given value" + v);
        }
      
//QUESTION 4//
     
       Scanner sc= new Scanner(System.in);

       int t= sc.nextInt();

       int c= sc.nextInt();

       int s= sc.nextInt();

       int n= sc.nextInt();

       int k= (t*t-c*c)/2*n*s;

       System.out.println(k);


//QUESTION 5//

      int f=7;
       int g= 7*49/7+35/7;

       System.out.println("value of g is:"+g);


    }
}
