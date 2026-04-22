package org.core.stream.api.grouping_employee;

import org.core.stream.api.model.Employee;

import java.util.Comparator;
import java.util.List;

import static org.core.stream.api.mock.EmployeeData.getEmployees;

public class EmployeeSorted {
    static void main(String[] args) {
        EmployeeSorted example = new EmployeeSorted();
        example.getSortedEmployee();
    }

    public void getSortedEmployee() {
        List<Employee> employees = getEmployees();
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(employee ->
                        System.out.printf("Employee: %-15s | Salary: %.2f%n",
                                employee.getEmployeeName(),
                                employee.getSalary())
                );

        employees.stream()
                .sorted((Comparator.comparing(Employee::getDepartmentName).thenComparing(Employee::getEmployeeName)))
                .forEach(employee ->
                        System.out.printf("Employee: %-15s | Department: %s%n",
                                employee.getEmployeeName(),
                                employee.getDepartmentName())
                );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getEmployeeName).reversed())
                .forEach(employee ->
                        System.out.printf("Employee: %-15s | Name: %s%n",
                                employee.getEmployeeName(),
                                employee.getEmployeeName())
                );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(employee ->
                        System.out.printf("Employee: %-15s  | Salary: %.2f%n",
                                employee.getEmployeeName(),
                                employee.getSalary())
                );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartmentName).thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(employee ->
                        System.out.printf("Employee: %-15s | Department: %s | Salary: %.2f%n",
                                employee.getEmployeeName(),
                                employee.getDepartmentName(),
                                employee.getSalary())
                );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartmentName).thenComparing(Comparator.comparing(Employee::getEmployeeName).reversed()))
                .forEach(employee ->
                        System.out.printf("Employee: %-15s | Department: %s | Name: %s%n",
                                employee.getEmployeeName(),
                                employee.getDepartmentName(),
                                employee.getEmployeeName())
                );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartmentName).thenComparing(Comparator.comparing(Employee::getEmployeeName).reversed()))
                .forEach(employee ->
                        System.out.printf("Employee: %-15s | Department: %s | Name: %s%n",
                                employee.getEmployeeName(),
                                employee.getDepartmentName(),
                                employee.getEmployeeName())
                );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartmentName).thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(employee ->
                        System.out.printf("Employee: %-15s | Department: %s | Salary: %.2f%n",
                                employee.getEmployeeName(),
                                employee.getDepartmentName(),
                                employee.getSalary())
                );

    }
}
