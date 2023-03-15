import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){

        Scanner inp= new Scanner(System.in);

System.out.println("Enter your age");

    //switch cases in java//

int age;

age= inp.nextInt();

switch (age) {
    case 18:
        System.out.println("you are going to become an adult");

        break;
case 23:
       System.out.println("you are going to get a job");
       break;
case 60:
 System.out.println("you are going to retire");
 break;
    default:
    System.out.println("enjoy your life");
        
}

System.out.println("thanks for using java code");

System.out.println("enter your variable");
String var;

var = inp.next();
switch (var) {
    case "r":
    System.out.println("your age is between 1-5");
        
        break;
case "f":
System.out.println("your age is between 5-15");
  break;
  case "g":
  System.out.println("your age is between 15-25");
break;
    default:
    System.out.println("you entered wrong variable");
        break;
}
    }
}
