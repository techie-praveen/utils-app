package org.core.stream.api.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private int employeeId;
    private String employeeName;
    private String email;
    private String phoneNumber;
    private String departmentName;
    private String designation;
    private double salary;
    private String location;
}