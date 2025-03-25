
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id is: "+id);
        System.out.println("my name is: "+name);
    }

    public int getSalary(){
        return salary;
    }
    
}


public class OOPS_concept {
    public static void main(String[] args) {
        Employee haary= new Employee();
        haary.id=18;
        haary.name= "anupam";
        haary.salary=15000;

        haary.printDetails();
        haary.getSalary();

        Employee john = new Employee();
        john.id=17;
        john.name="John sharma";
        john.salary=17000;
        

        john.printDetails();
        int salary =john.getSalary();
        System.out.println(salary);
    }
}