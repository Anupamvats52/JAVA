
class myEmployee{
    private int id;
    private String name; 

    public void setid(int i){
        id=i; 
    }
    public int getid(){
        return id;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name; 
    }

}



public class getset {
    public static void main(String[] args) {
    myEmployee emp = new myEmployee();
    emp.setid(1100);
    System.out.println(emp.getid());
    emp.setName("anupam vats");
    System.out.println(emp.getName());
    
    }
}
