package university;
public class Professor extends Employee {
 private String department, researchArea;
 public Professor(String name, int age, double salary, String department, String
 researchArea) {
 super(name, age, "Professor", salary);
 this.department = department;
 this.researchArea = researchArea;
 }
 @Override
 public String getDetails() {
 return "Professor- Name: " + name + ", Age: " + age + ", Salary: $" + salary + ",Department: " + department + ", Research Area: " + researchArea;
 }
 }