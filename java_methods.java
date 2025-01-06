
public class java_methods { 
     int Logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;

    }


    public static void main(String[] args) {
        int a=10;
        int b=12;
        int c=13;
        int d= 15;
        java_methods obj= new java_methods();
        int e= obj.Logic(a, b);
        int f= obj.Logic(c, d);
         System.out.println(e);
         System.out.println(f);
    }
}
