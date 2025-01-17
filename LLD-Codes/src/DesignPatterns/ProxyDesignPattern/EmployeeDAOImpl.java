package DesignPatterns.ProxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void create(String client, EmployeeDo obj) {
        System.out.println("Creates new row in the Employee table");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Deleted row with employeeId : " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) {
        System.out.println("Fetching data from DB");
        return new EmployeeDo();
    }
}
