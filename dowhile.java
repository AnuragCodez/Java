import java.util.Scanner;

public class dowhile {
    public static void main(String args[]){

    Scanner inp = new Scanner(System.in);
    System.out.println("enter value");
    // DO WHILE LOOP//    
    //   int n = inp.nextInt();
    //     int b = 1;
       
    //     do{
    //        System.out.println(b);
    //         b++;
    //     }
    //     while(b<=n);

    // FOR LOOP //
// int i ;
//     for (i=1; i<=10;i++){
//         System.out.println(i);
//     }

    // first n odd numbers using for loop//
 int n = inp.nextInt();
//         int k;
//         for(k=1; k<=n; k++){
//             if(k%2!=0){
//             System.out.println(k);}
//         }
//        int a;
//        for(a=n; a!=0; a--){
// System.out.println(a);
//  if(a==50){
//     System.out.println("loop is ending");
//     break;
//  }
//         }
int c =0;
    do{
        System.out.println(c);
          c++;
          if(c==5)
    break;
       
    }
    while(c<=n);
    
    

    } 
}
