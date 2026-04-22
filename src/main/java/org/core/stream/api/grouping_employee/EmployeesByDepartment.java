package org.core.stream.api.grouping_employee;

import org.core.stream.api.model.Employee;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

//        If you want to preserve insertion order, use LinkedHashMap as the map supplier.
        Map<String, List<Employee>> groupedByDept = data.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentName,LinkedHashMap::new,Collectors.toList() ));

        groupedByDept.forEach((dept, empList) -> {
            System.out.println("Department ##: " + dept);
            empList.forEach(System.out::println);
        });

        Map<String, Long> deptCount = data.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartmentName,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println("Department Wise##: " + deptCount);


        Map<String, List<Employee>> sortedMap = data.stream()
                .sorted(Comparator.comparing(Employee::getDepartmentName).reversed())
                .collect(Collectors.groupingBy(
                        Employee::getDepartmentName,
                        LinkedHashMap::new,
                        Collectors.toList()
                ));

        System.out.println("Sorted Department Wise##: " + sortedMap);



        data.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartmentName,
                        LinkedHashMap::new,
                        Collectors.toList()
                ))
                .forEach((s, employees) -> System.out.println("Department: " + s + ", Employees: " + employees));
    }
}
