
class Base{
    int x;

    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("i am setting x now");
        this.x=x;
    }

    public void printx(){
        System.out.println("i am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int gety(){
      return y;  
    }
    public void sety(int y){
        System.out.println("i am setting Y now");
        this.y=y;

    }

}


public class Inheritance {
    public static void main(String[] args) {
        // Base b= new Base();
        Derived b = new Derived();
        b.setx(4);
        System.out.println(b.getx());
        b.sety(7);
        System.out.println(b.gety());
    }
}
