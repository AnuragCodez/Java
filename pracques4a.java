import java.util.Scanner;

public class pracques4a {
    public static void main(String args[]){

         Scanner inp= new Scanner(System.in);

        //  QUESTION 1//
        int a= 10;

        if
        (a==11){System.out.println("i am 11");}
        else{
            System.out.println("i am not 11");
        }
        //we cannot use arithmetic operators in if else conditions only relational operators can be used//

//QUESTION 2//

   System.out.println("Enter Your Marks");

   System.out.println("sub 1");

  int b =    inp.nextInt();

  if(b<=33){
    System.out.println("your are fail in the subject");}
    else{
       System.out.println("you have passed the subject");
    }

  System.out.println("sub 2");

  int c = inp.nextInt();

  if(c<=33){
    System.out.println("your are fail in the subject");}
    else{
       System.out.println("you have passed the subject");
    }

  System.out.println("sub 3");

  int d = inp.nextInt();

  if(d<=33){
    System.out.println("your are fail in the subject");}
    else{
       System.out.println("you have passed the subject");
    }

  System.out.println("sub 4");

  int e = inp.nextInt();

  if(e<=33){
    System.out.println("your are fail in the subject");}
    else{
       System.out.println("you have passed the subject");
    }

  System.out.println("sub 5");

  int f = inp.nextInt();

  if(f<=33){
    System.out.println("your are fail in the subject");}
    else{
       System.out.println("you have passed the subject");
    }

  float j = b+c+d+e+f;

  float k = j/5;

System.out.println("Your Percentage");

  System.out.println(k);

if(k<40){
    System.out.println("you are fail in the exam");
}
else{
    System.out.println("you have passed");
}
  //QUESTION 3//

   Scanner tax = new Scanner(System.in);

   System.out.println("enter your income");

   int x= tax.nextInt();
   
float  y= x*0.05f;

 float u= x*0.20f;

 float l= x*0.30f;

 if(x>500000){
    System.out.printf("your tax is");
    System.out.println(u);
 }

else if(x>1000000){
  System.out.printf("your tax is");
  System.out.println(l);
}
else{
    System.out.printf("your tax is");
    System.out.println(y);
}
System.out.println("thank you");


}
}
