package employee;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
public record LeaveRecord(int ID,int totalLeaves, int leavesTaken) {
    /**
     * calculate how many leave days the employee left.
     * @return string about how muck days left.
     */
    @Override
    public  String  toString(){
        return "The remaining leave days left are:  "+(totalLeaves-leavesTaken);
    }
}
