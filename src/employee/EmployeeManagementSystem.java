package employee;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        //Leave
        LeaveRecord LR1 = new LeaveRecord(959595959,15,8);
        LeaveRecord LR2 = new LeaveRecord(748483635,33,4);
        //Payroll
        PayrollRecord PR1 = new PayrollRecord(123456789,20000,5000,8000);
        PayrollRecord PR2 = new PayrollRecord(123456709,20500,9000,11000);
        //Employee
        EmployeeRecord ER1 = new EmployeeRecord(123456777,"michael",25,"computer science","CEO");
        EmployeeRecord ER2 = new EmployeeRecord(123444777,"oleg",24,"computer science","CFO");
        //Attendance
        AttendanceRecord AR1 = new AttendanceRecord(565838392,365,280);
        AttendanceRecord AR2 = new AttendanceRecord(565318392,365,300);
        System.out.println(LR1);
        System.out.println(LR2);
        System.out.println(PR1);
        System.out.println(PR2);
        System.out.println(ER1);
        System.out.println(ER2);
        System.out.println(AR1);
        System.out.println(AR2);
    }
}
