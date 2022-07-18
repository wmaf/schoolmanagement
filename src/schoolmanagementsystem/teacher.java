package schoolmanagementsystem;

public class teacher {

    private int id;
    private String name;
    private  int salary;

    public teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // getters to return the values .


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
// do not need setters for id and name.  but salary we need.

