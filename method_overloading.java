

public class method_overloading {
    static void foo(){
        System.out.println("Good Morning bro!");

    }

    static void foo(int a) { //Parameter
        System.out.println("Good Morning "+a+" bro!");
    }

    static void foo(int a,int b) { //Parameter
        System.out.println("Good Morning "+a+" bro!");
        System.out.println("Good Morning "+b+" bro!");
    }

    public static void main(String[] args) {
        foo();
        foo(100); //Arguments are Actual
        foo(120 , 90);
    }
}
