
class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }

}



public class getsetPractice {
    public static void main(String[] args) {
       Cylinder mCylinder= new Cylinder();
       mCylinder.setHeight(123);
       System.out.println(mCylinder.getHeight());
       mCylinder.setRadius(321);
       System.out.println(mCylinder.getRadius()); 
    }
}
