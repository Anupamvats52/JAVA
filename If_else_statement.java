import java.util.Scanner;
// public class If_else_statement {
//     public static void main(String[] args) {
//         // int age=16;
//         int age;
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter your age");
//         age= sc.nextInt();
//         if(age>18){
//             System.out.println("YES! you can drive");
//         }else{
//             System.out.println("NO! you can't drive yet");
//         }
//     }
// }

public class If_else_statement{
    public static void main(String[] args) {
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age");
        age= sc.nextInt();
        /*if(age>56){
            System.out.println("you are Experienced");
        }
        else if(age>46){
            System.out.println("you are semi-experienced");
        }else{
            System.out.println("you are not experienced");
        } */

        switch(age){
            case 18:
                   System.out.println("you are now Adult");
                   break;
            case 23:
                   System.out.println("you are going to join a job");     
                   break;
            case 60: 
                   System.out.println("you are going to get retired");  
                   break;
             default:
                    System.out.println("Enjoy your life");             
        } 

        System.out.println("Thanks for using Java code!");


    }
}
