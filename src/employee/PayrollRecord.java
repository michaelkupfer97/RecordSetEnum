package employee;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
public record PayrollRecord(int ID,int salary,int bonus, int tax) {
    /**
     * calculate the net salary.
     * @return string about the net salary.
     */
    @Override
    public  String  toString(){
        return "The net salary is: "+(salary+bonus-tax);
    }

}
