package schoolmanagementsystem;

/* Created by William Ford
   Priority class homework assignment.
   With, OOP  to track students name, grades, fees and fees paid.
 */

public class students {

    private int id;

    private String name;

    private int grade;

    private int feesPaid;

    private int feesTotal;

    // Constructor creates new student object to initilizing the parameter.
    public students(int id, String name, int grade, int feesPade, int feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = feesPaid = 0;  //value is initialized here.
        this.feesTotal = feesTotal = 30000;
    }

    // we will not be altering the students name & id.
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFeesUpdate(int fees) {
        this.feesPaid + = fees;
    }
}