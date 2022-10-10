public class Employee {
    private int salary;
    private final String fullname;
    private final int department;
    private final int id;
    public static int counter = 0;

    public Employee(String fullname, int salary, int department) {
        this.salary = salary;
        this.fullname = fullname;
        this.department = department;
        this.id = counter++;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFullname() {
        return fullname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return " " + fullname + " " + salary + " рублей. " + "id = " + id + " Отдел " + department;
    }
}
