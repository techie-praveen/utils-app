package org.core.stream.api.grouping_employee;

import org.core.stream.api.model.Employee;

import java.util.List;
import java.util.UUID;

import static org.core.stream.api.mock.EmployeeData.getEmployees;

public class UpdateExistingEmployee {

    static void main(String[] args) {
        UpdateExistingEmployee example = new UpdateExistingEmployee();
        example.updateEmployee();
    }

    private void updateEmployee() {
        List<Employee> employees = getEmployees();

        employees.stream()
                .filter(employee -> employee.getEmployeeId() == 101)
                .findFirst()
                .ifPresent(employee -> {
                    employee.setEmail("praveen.kumar@gmail.com");

                    System.out.println("Updated Employee Details:");
                    System.out.println("ID: " + employee.getEmployeeId());
                    System.out.println("Name: " + employee.getEmployeeName());
                    System.out.println("Email: " + employee.getEmail());
                    System.out.println("Department: " + employee.getDepartmentName());
                    System.out.println("Salary: " + employee.getSalary());
                });


    }

}
