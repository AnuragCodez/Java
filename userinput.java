
import java.util.Scanner;


public class userinput {
    public static void main(String[] args){

        System.out.println("Taking input from the User!");
Scanner sc = new Scanner(System.in);
System.out.println("enter number1");
   float a= sc.nextFloat();
System.out.println("enter number 2");
int b= sc.nextInt();
System.out.println("enter number 3");
int c= sc.nextInt();
System.out.println("enter number 4");
int d= sc.nextInt();
System.out.println("enter nummber 5");
int e= sc.nextInt();

float sum=a+b+c+d+e;
System.out.println("The sum is"+ sum);


    }
}
