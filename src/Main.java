public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Schrempf", "Victoria", 30, 101, 50000);
        System.out.println(emp.toString());

        emp.salaryIncrease(10); // Erhöht das Gehalt um 10%
        System.out.println("Neues Gehalt: " + emp.getSalary());
    }
}
