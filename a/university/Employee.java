package university;
abstract public class Employee implements Person {
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