
public class Employee extends Person {
    private int supervisorID;
    private double salary;

    public Employee(String name, String firstName, int age, int supervisorID, double salary) {
        super(name, firstName, age);
        this.supervisorID = supervisorID;
        this.salary = salary;
    }

    public int getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(int supervisorID) {
        this.supervisorID = supervisorID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Gehalt kann nicht negativ sein.");
        }
    }

    // Methode zur Gehaltserhöhung
    public void salaryIncrease(float percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
            System.out.println("Neues Gehalt nach Erhöhung: " + this.salary);
        } else {
            System.out.println("Ungültiger Prozentsatz für Gehaltserhöhung.");
        }
    }

    // Überschreiben der toString()-Methode
    @Override
    public String toString() {
        return super.toString() + ", SupervisorID: " + supervisorID + ", Gehalt: " + salary;
    }
}
