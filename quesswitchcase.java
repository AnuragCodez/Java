import java.util.Scanner;

public class quesswitchcase {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
//QUESTION1//

/*int a;

if(){
    System.out.println("value is 11");
}
    
else{
    System.out.println("value is not =11");
}
*/
//QUESTION2//
/* 
System.out.println("enter your number");

System.out.println("first marks");

int a= inp.nextInt();

System.out.println("second marks");

int b= inp.nextInt();

System.out.println("third marks");

int c= inp.nextInt();

float d= (a+b+c)*100/300f;

System.out.println("your percentage");
System.out.println(d);

if(a<=33){
      System.out.println("you fail in subject a");
}
else if(b<=33){
    System.out.println("you fail in subject b");
}
else if(c<=33){
    System.out.println("you fail in subject c");
}
else{
System.out.println("you are pass in each subject");
}
if(d>=33){
    System.out.println("you pass overall");
}
    else{
        System.out.println("you fail overall");
    }*/
//QUESTION 3//

System.out.println("enter your income");
   int val= inp.nextInt();

   if(val>250000 && val<500000){
    float dash=val*5/100;
System.out.println("your tax is 5%");
System.out.println(dash);
   }
   else if(val>=500000 && val<1000000){
    float dash=val*20/100;
    System.out.println("your tax is 20%");
    System.out.println(dash);
   }
   else if(val>=1000000){
    float dash=val*30/100;
    System.out.println("tax is 30%");
    System.out.println(dash);
   }
   else{
    System.out.println("tax is 0%");
   }
   System.out.println("thanks for your response");
   

   
}
}

 
    

