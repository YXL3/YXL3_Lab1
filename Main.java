public class Main {
    public static void main(String[] args) {
        EmployeeSystem employeeSystem=new EmployeeSystem();
        employeeSystem.CreateEmployee(1,"A");
        employeeSystem.CreateEmployee(2,"B");
        employeeSystem.CreateEmployee(3,"C");
        employeeSystem.DeleteEmployee("B");
        employeeSystem.CreateEmployee(4,"A");
        employeeSystem.CreateEmployee(5,"D");
        employeeSystem.PrintList();
    }
}
