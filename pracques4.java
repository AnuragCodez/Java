import java.util.Scanner;

public class pracques4 {
    
    public static void main(String[] args){

//problem1//

     String name= "ANURAG";
name =name.toLowerCase();
    System.out.println(name.toLowerCase());

//PROBLEM2//

String name1= "chomu is good boy";

 name1= name1.replace(" ","_");

 System.out.println(name1);

 //PROBLEM3//

 Scanner inp = new Scanner(System.in);

 String name2= "Dear <|name|>, Thanks a lot!";

 System.out.println(name2.replace("name", "Anurag"));

//PROBLEM4//

String name3 = "CHOMU IS A BAD BOY  HE IS  DASH PERSON";

System.out.println(name3.indexOf("  "));

System.out.println(name3.indexOf("   "));

//PROBLEM5//

String name4="Dear <|name|> ,\n This java course is nice. \nThanks";

System.out.println(name4.replace("name","Anurag"));




    }
}
