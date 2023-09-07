package employee;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
public record AttendanceRecord(int ID, int totalWorkingDays, int daysPresent) {
    /**
     *method that calculate the Attendance percentage of employee.
     * @return string about the Attendance percentage.
     */
    @Override
    public  String  toString(){
        return "The Attendance percentage is:  "+(((double)daysPresent/(double)totalWorkingDays))*100+"%";
    }
}
