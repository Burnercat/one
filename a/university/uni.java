package university;

 interface Person {
    String getDetails();
    void printDetails();
 }


 abstract class Employee implements Person {
    protected String name, designation;
    protected int age;
    protected double salary;
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
    @Override
    public void printDetails() {
        System.out.println(getDetails());
    }
}
 // Subclass Professor
 class Professor extends Employee {
     private String department, researchArea;
     public Professor(String name, int age, double salary, String department, String researchArea) {
        super(name, age, "Professor", salary);
        this.department = department;
        this.researchArea = researchArea;
    }
    @Override
    public String getDetails() {
        return "Professor- Name: " + name + ", Age: " + age + ", Salary: $" + salary + ", Department: " + department + ", Research Area: " + researchArea;
    }
}

class AdminStaff extends Employee {
    private String role;
    private int workingHours;
    public AdminStaff(String name, int age, double salary, String role, int workingHours){
        super(name, age, "Admin Staff", salary);
        this.role = role;
        this.workingHours = workingHours;
    }
    @Override
    public String getDetails() {
        return "Admin Staff- Name: " + name + ", Age: " + age + ", Salary: $" + salary + ", Role: " + role + ", Working Hours: " + workingHours;
    }
}
