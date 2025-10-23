public class Employee {
    int employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;
    double startTime;

    public Employee(int id, String name, String department, double payRate) {
        this.employeeId = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.startTime = 0;
    }

    public boolean punchIn(double time) {
        if (startTime != 0) {
            System.out.println("Already punched in!");
            return false;
        }
        startTime = time;
        System.out.println(name + " punched in at " + time);
        return true;
    }

    public boolean punchOut(double time) {
        if (startTime == 0) {
            System.out.println("Must punch in first!");
            return false;
        }
        double hours = time - startTime;
        hoursWorked += hours;
        startTime = 0;
        System.out.println(name + " punched out at " + time + ". Hours worked: " + hours);
        return true;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}