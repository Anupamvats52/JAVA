
class mainEmployee{
    private int id;
    private String name;

    public mainEmployee() {
        name="Anupam vats";
        id= 161;
    }

    public mainEmployee(String myname, int myid) {
        name=myname;
        id= myid;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getid(){
        return id;
    }
    public void setid(int i){
        this.id=i;
    }
}

public class Constructors {
    public static void main(String[] args) {
    //    mainEmployee emp=new mainEmployee("Pratigya sharma", 162); 
       mainEmployee emp=new mainEmployee(); 
       System.out.println(emp.getid());
       System.out.println(emp.getName());
    }
}
