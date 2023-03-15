import java.util.Scanner;

public class booleans {
    public static void main(String[] args){
        System.out.println("Taking input from users");

        Scanner sc= new Scanner(System.in);

        boolean b= sc.hasNextInt();
        System.out.println("Value is:");
        System.out.println(b);
String str= sc.next();
// String str= sc.nextLine();
System.out.println(str);
    }
}
