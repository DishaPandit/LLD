package DesignPatterns.ProxyDesignPattern;

public class Main {

    public static void main(String[] args) {

        try{
            EmployeeDAO empTableObj = new EmployeeDAOProxy();
            empTableObj.create("ADMIN", new EmployeeDo());

            empTableObj.create("USER", new EmployeeDo());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
