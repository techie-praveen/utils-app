package org.core.stream.api.grouping_employee;

import org.core.stream.api.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

import static org.core.stream.api.mock.EmployeeData.getEmployees;

public class EmployeesByDepartment {

    static void main() {
            EmployeesByDepartment example = new EmployeesByDepartment();
            example.groupEmployeesByDepartment();
    }

    public void groupEmployeesByDepartment() {
        List<Employee> data = getEmployees();
        System.out.println("Employees grouped by department:");

        data.stream().collect(Collectors.groupingBy(Employee::getDepartmentName))
                .forEach((department, employees) -> {
                    System.out.println("Department: " + department);
                    employees.forEach(employee -> System.out.println("  " + employee.getEmployeeName()));
                });

        data.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()))
                .forEach((department, count) -> System.out.println("Department: " + department + ", Count: " + count));

        data.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.summarizingDouble(Employee::getSalary)))
                .forEach((department, stats) -> System.out.println("Department: " + department + ", Salary Stats: " + stats));

        data.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))))
                .forEach((department, employee) -> System.out.println("Department: " + department + ", Highest Paid Employee: " + employee.orElse(null)));

        data.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.mapping(Employee::getEmployeeName, Collectors.joining(", "))))
                .forEach((department, employeeNames) -> System.out.println("Department: " + department + ", Employees: " + employeeNames));

        data.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.partitioningBy(e -> e.getSalary() > 50000)))
                .forEach((department, partition) -> {
                    System.out.println("Department: " + department);
                    System.out.println("  Employees with salary > 50000:");
                    partition.get(true).forEach(employee -> System.out.println("    " + employee.getEmployeeName()));
                    System.out.println("  Employees with salary <= 50000:");
                    partition.get(false).forEach(employee -> System.out.println("    " + employee.getEmployeeName()));
                });

        data.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.flatMapping(e -> e.getLocation().lines(), Collectors.toSet())))
                .forEach((department, locations) -> System.out.println("Department: " + department + ", Locations: " + locations));


    }
}
