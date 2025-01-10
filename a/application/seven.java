 // Main application in a different package
 package application;
 import university.*;
 public class UniversityManagementApp {
 public static void main(String[] args) {
 Professor prof = new Professor("Dr. John Smith", 45, 90000, "Computer Science","Artificial Intelligence");
 AdminStaff admin = new AdminStaff("Alice Brown", 38, 60000, "HR Manager",40);
 System.out.println("University Employees:");
 prof.printDetails();
 admin.printDetails();
 }
 }