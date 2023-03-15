import java.util.Scanner;

public class string2 {
    public static void main(String[] args){

System.out.println("Enter your words");
         Scanner inp = new Scanner(System.in);
      // String st= inp.nextLine();

       //System.out.printf("Value is: %s", st);

      // String a = new String("Anurag");

       //System.out.format(a);//
//1//
    String name= new String("chomu");

    String value = name.toUpperCase();

    System.out.println(value);
       //2//
 String nontrimmedstring ="  Aditya is dash person  ";

System.out.println(nontrimmedstring);

     String values = nontrimmedstring.trim();

     System.out.println(values);
//3//
   String substr= "harry";

System.out.println(substr.substring(3));

//4//

String a ="dash";
    
   System.out.println(a.substring(1, 4));
//5//


 String name1= "dashh";

   System.out.printf(name1.replace('h', 's'));

//6//

String name2= "choms";

System.out.println(name2.startsWith("vb"));

//7//

     String name3= "ANURAG";

     System.out.println(name3.endsWith("ANU"));

//8//

     String name4= "Dash";

     System.out.println(name4.charAt(3));

//9//

     String name5= "CHOMUDASH";

     System.out.println(name5.indexOf("S"));

//10//
  
      String namemodified = "dashdash";
       System.out.println(namemodified.indexOf("ash",2));

       // -1 in case str does not match with string given//
//11//

       String name6= "anuraganurag";

       System.out.println(name6.lastIndexOf("ag"));

       String name7= "javajava";

       System.out.println(name7.lastIndexOf("va",3));

//12//

      String name8="dashdash";

      System.out.println(name8.equals("dash"));

//13//

      String name9= "anurag";

      System.out.println(name9.equalsIgnoreCase("ANURAG"));

//IF WE WANT TO REMOVE BACK SLASH OR DOUBLE QUOTE WE HAVE TO USE / TO REMOVE EEOR//

     //System.out.println("anurag""anurag");

     System.out.println("dash\"anurag");

     System.out.println("chomu\nchomu");

     System.out.println("dash\\ dash");


    }
}
