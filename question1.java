import java.util.Scanner;

public class question1 {
    public static void main(String[] args){
       
       System.out.println("enter your marks"); 
       Scanner sc= new Scanner(System.in);
        System.out.println("enter 1");
       int a= sc.nextInt();
System.out.println("enter 2");
 int b= sc.nextInt();
     System.out.println("enter 3");
     int c= sc.nextInt();
 System.out.println("enter 4");
  int d= sc.nextInt();
  System.out.println("enter 5");
  int e= sc.nextInt();
 int sum= a+b+c+d+e;
 System.out.println(sum);
  float div= sum/500f;
  float per= div*100;
  System.out.println("Your percntage is:" + per);
  System.out.println("thanks");
    }
}
