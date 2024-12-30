
//     public static void main(String[] args) {
//         System.out.println("hello world");
//     }
// }


// public class Basicjava{
//     public static void main(String[] args) {
//         int num1= 4;
//         int num2= 14;
//         int num3= 24;
//         int sum= num1 + num2 + num3;
//         System.out.println("Sum of number:"+sum);
//     }
// }


// import java.util.Scanner;
// public class Basicjava{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("number of subjects");
//         int subjects= sc.nextInt();
//         int total_marks= subjects*100;
//         System.out.println("enter marks");
//         int marks1= sc.nextInt();
//         int marks2= sc.nextInt();
//         int marks3= sc.nextInt();
//         int marks4= sc.nextInt();
//         int marks5= sc.nextInt();

//         int Obtained_marks= (marks1+ marks2+ marks3+ marks4+ marks5);

//         float Percentage= (float)(Obtained_marks*100)/total_marks;
//         System.out.println("percentage achieved :"+Percentage);


//     }
// }

// kilometer to Miles

// import java.util.Scanner;
// public class Basicjava{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter Distance");
//         Float Kilometer = sc.nextFloat();

//         double Miles= (double)(Kilometer* 0.621371);

//         System.out.println("Distance in miles: "+Miles );



//     }
// }

// checking entered number is Integer or not?

// public class Basicjava{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter number");
//         boolean is_Integer= sc.hasNextInt();
//         System.out.println(is_Integer);
        
//     }
// }

// String to lowercase

// public class Basicjava{
//     public static void main(String[] args) {
//         String str= "ANUpam VAts";
//         str= str.toLowerCase();
//         System.out.println("lowercase String: "+str);
//     }
// }

// Replace space with Underscore
// public class Basicjava{
//     public static void main(String[] args) {
//         String str= "In this problem we are replacing space with underscore";
//         str= str.replace(" ", "_");
//         System.out.println(str);
//     }
// }

// double and triple spaces

// public class Basicjava{
//     public static void main(String[] args) {
//         String str= "this contain  double and    triple spaces";
//         System.out.println(str.indexOf("  "));
//         System.out.println(str.indexOf("   "));
//     }
// }

// Escape Sequence Character

public class Basicjava{
    public static void main(String[] args) {
        String str= "Hey Dear,\n\tThis side Anupam vats.\n\n\tThanks";
        System.out.println(str);
    }
}