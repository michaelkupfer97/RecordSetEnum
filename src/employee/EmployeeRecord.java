package employee;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246

/**
 * represent the employee details
 * @param ID employee id
 * @param name employees name
 * @param age employees age
 * @param department employees department
 * @param designation employees designation
 */
public record EmployeeRecord(int ID, String name, int age,
                             String department, String designation) {}
