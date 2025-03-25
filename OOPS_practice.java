class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
        System.out.println(name);
    }


}
public class OOPS_practice {
    public static void main(String[] args) {
        Employee emp= new Employee();
        // Anupam.setName("Anupamvats");
        // System.out.println(Anupam.getName());
        // Anupam.name= "anupam vats";
        // Anupam.getName();

    }
}
