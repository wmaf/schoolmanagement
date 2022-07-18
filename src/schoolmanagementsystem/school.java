package schoolmanagementsystem;

import java.util.List;

public class school {
    private List <teacher> teachers;
    private List<students> students;
    private int totalMoneyEarned = 0;
    private int totalMoneySpent = 0;

    public school(List<teacher> teachers, List<schoolmanagementsystem.students> students, int totalMoneyEarned, int totalMoneySpent) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = totalMoneyEarned;
        this.totalMoneySpent = totalMoneySpent;

    }

    public List<teacher> getTeachers() {
        return teachers;
    }

    public List<schoolmanagementsystem.students> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}

