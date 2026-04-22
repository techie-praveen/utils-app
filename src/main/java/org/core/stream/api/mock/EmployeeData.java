package org.core.stream.api.mock;

import org.core.stream.api.model.Employee;

import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(101, "Praveen Kumar", "praveen1@gmail.com", "9876543210", "IT", "Software Engineer", 60000, "Bangalore"),
                new Employee(102, "Rahul Sharma", "rahul@gmail.com", "9876543211", "HR", "HR Manager", 55000, "Hyderabad"),
                new Employee(103, "Anjali Verma", "anjali@gmail.com", "9876543212", "Finance", "Accountant", 50000, "Chennai"),
                new Employee(104, "Sneha Reddy", "sneha@gmail.com", "9876543213", "IT", "Developer", 62000, "Pune"),
                new Employee(105, "Amit Singh", "amit@gmail.com", "9876543214", "Sales", "Sales Executive", 48000, "Mumbai"),
                new Employee(106, "Kiran Rao", "kiran@gmail.com", "9876543215", "Admin", "Administrator", 45000, "Delhi"),
                new Employee(107, "Vikram Patel", "vikram@gmail.com", "9876543216", "IT", "QA Engineer", 53000, "Bangalore"),
                new Employee(108, "Neha Gupta", "neha@gmail.com", "9876543217", "Marketing", "Marketing Lead", 57000, "Noida"),
                new Employee(109, "Ravi Kumar", "ravi@gmail.com", "9876543218", "Support", "Support Engineer", 47000, "Chennai"),
                new Employee(110, "Pooja Mehta", "pooja@gmail.com", "9876543219", "Finance", "Financial Analyst", 59000, "Mumbai"),
                new Employee(111, "Arjun Das", "arjun@gmail.com", "9876543220", "IT", "Tech Lead", 85000, "Bangalore"),
                new Employee(112, "Divya Nair", "divya@gmail.com", "9876543221", "HR", "Recruiter", 46000, "Kochi"),
                new Employee(113, "Manoj Kumar", "manoj@gmail.com", "9876543222", "Sales", "Area Manager", 61000, "Delhi"),
                new Employee(114, "Lakshmi Iyer", "lakshmi@gmail.com", "9876543223", "IT", "Backend Developer", 68000, "Hyderabad"),
                new Employee(115, "Suresh Babu", "suresh@gmail.com", "9876543224", "Support", "L2 Support", 49000, "Pune"),
                new Employee(116, "Meena Joshi", "meena@gmail.com", "9876543225", "Admin", "Office Manager", 44000, "Mumbai"),
                new Employee(117, "Harish Gowda", "harish@gmail.com", "9876543226", "IT", "Frontend Developer", 64000, "Bangalore"),
                new Employee(118, "Swathi Rao", "swathi@gmail.com", "9876543227", "Marketing", "SEO Analyst", 51000, "Hyderabad"),
                new Employee(119, "Nitin Jain", "nitin@gmail.com", "9876543228", "Finance", "Auditor", 56000, "Delhi"),
                new Employee(120, "Kavya Shetty", "kavya@gmail.com", "9876543229", "IT", "Full Stack Developer", 72000, "Bangalore")
        );
    }
}