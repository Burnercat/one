package university;
public class AdminStaff extends Employee {
 private String role;
 private int workingHours;
 public AdminStaff(String name, int age, double salary, String role, int workingHours)
 {
 super(name, age, "Admin Staff", salary);
 this.role = role;
 this.workingHours = workingHours;
 }
 @Override
 public String getDetails() {
 return "Admin Staff- Name: " + name + ", Age: " + age + ", Salary: $" + salary + ",Role: " + role + ", Working Hours: " + workingHours;
 }
 }