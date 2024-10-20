public abstract class Employee implements Payable {
    // TODO fix class declaration and declare variables here
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        // TODO fill in code here
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        // TODO fill in code here and replace the return statement
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        // TODO fill in code here
        this.employeeId = employeeId;
    }

    public String getName() {
        // TODO fill in code here and replace the return statement
        return name;
    }

    public void setName(String name) {
        // TODO fill in code here
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return calculatePay();
    }

    @Override
    public abstract double calculatePay();

    @Override
    public String toString() {
        // TODO fill in code here and replace the return statement, be sure to format double value
        return "Employee ID: " + employeeId + ", Name: " + name + ", Average Monthly Salary: " + String.format("%.2f", calculatePay());
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("E1", "Ivan", "123");
        salariedEmployee1.setFixedMonthlyPayment(4500);

        ContractedEmployee contractedEmployee1 = new ContractedEmployee("E2", "Hanna", "456");
        contractedEmployee1.setHourlyRate(20);
        contractedEmployee1.setNumberOfHoursWorked(140);

        SalariedEmployee salariedEmployee2 = new SalariedEmployee("E3", "Petro", "789");
        salariedEmployee2.setFixedMonthlyPayment(3200);

        employees[0] = salariedEmployee1;
        employees[1] = contractedEmployee1;
        employees[2] = salariedEmployee2;

        System.out.println("Employee info:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}