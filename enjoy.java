import java.util.Scanner;

public class enjoy {
    public static void main(String[] args){
  Scanner inp= new Scanner(System.in);
  //QUESTION 1//
 /*  int a=1;
  int n=5;

  System.out.println("enter your number");
   
   for(int i=1; i<=n; i++)
   {
    a=a*i;
   }
   System.out.println(a);*/
//QUESTION 2//


System.out.println("enter your number");
 Scanner n= new Scanner(System.in);
 int m= n.nextInt();
 int c=0;

  for(int i=2; i<m; i++){
   
   if(m%i==0)
   {
      c++;
   }
   
  }
  if(c==0){
   System.out.println("num is prime");
  }
   
   else{
System.out.println("num is not prime");
   }


   }

    }

