

class Base1{
    // int x;
    
    Base1(){
        System.out.println("i am a constructor");
    }
    Base1(int a){
        System.out.println("I am a constructor with value"+a);
    }
    // public int getx(){
    //     return x;
    // }
    // public void setx(int x){
    //     this.x=x;
    // }
}
 class Derived1 extends Base1{

    Derived1() {
        super(0);
        System.out.println("i am a derived class constructor");
    }
    
    // int y;
    // public int gety(){
    //     return y;
    // }
    // public void sety(int y){
    //     this.y=y;
    // }

 }

public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        Derived d= new Derived();
        
    }
} 
